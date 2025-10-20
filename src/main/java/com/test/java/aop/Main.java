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
		//�� ������ ����
//		Memo memo = new MemoImpl(); //�� �κе� bean���� ��������
		ApplicationContext context = new ClassPathXmlApplicationContext("com/test/java/aop/memo.xml");
		
		Memo memo = (Memo)context.getBean("memo");
		
		memo.memo_add("�޸��Դϴ�.");
		try {
			String content = memo.memo_read("1");
			System.out.println("�б�: " + content);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(memo.edit("1", "������ �޸�"));
		
		System.out.println(memo.del("1"));
	}
	
	private static void m2() {
		//�޸��� ����
		System.out.println("------m2()------\n");
		Logger logger = new Logger();
		Memo memo = new MemoImpl();
		
		memo.memo_add("�޸��Դϴ�.");
		logger.log();
		
		try {
			String content = memo.memo_read("1");
			System.out.println("�б�: " + content);
			logger.log();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(memo.edit("1", "������ �޸�"));
		logger.log();
		
		System.out.println(memo.del("1"));
		logger.log();
	}
	
	private static void m1() {
		//�޸��� ����
		Memo memo = new MemoImpl();
		
		memo.memo_add("�޸��Դϴ�.");
		try {
			String content = memo.memo_read("1");
			System.out.println("�б�: " + content);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(memo.edit("1", "������ �޸�"));
		
		System.out.println(memo.del("1"));
	}
	

}
