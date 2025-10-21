package com.test.java.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		//m1();
		//m2();
		m3();
	}
	private static void m3() {
		//주 업무만 존재
//		Memo memo = new MemoImpl(); //이 부분도 bean으로 만들어야함
		ApplicationContext context = new ClassPathXmlApplicationContext("com/test/java/aop/memo.xml");
		
		Memo memo = (Memo)context.getBean("memo");
		
		memo.memo_add("메모입니다.");
		try {
			String content = memo.memo_read("1");
			System.out.println("읽기: " + content);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(memo.edit("1", "수정된 메모"));
		
		System.out.println(memo.del("1"));
	}
	
	private static void m2() {
		//메모장 구현
		System.out.println("------m2()------\n");
		Logger logger = new Logger();
		Memo memo = new MemoImpl();
		
		memo.memo_add("메모입니다.");
		logger.log();
		
		try {
			String content = memo.memo_read("1");
			System.out.println("읽기: " + content);
			logger.log();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(memo.edit("1", "수정된 메모"));
		logger.log();
		
		System.out.println(memo.del("1"));
		logger.log();
	}
	
	private static void m1() {
		//메모장 구현
		Memo memo = new MemoImpl();
		
		memo.memo_add("메모입니다.");
		try {
			String content = memo.memo_read("1");
			System.out.println("읽기: " + content);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(memo.edit("1", "수정된 메모"));
		
		System.out.println(memo.del("1"));
	}
	

}
