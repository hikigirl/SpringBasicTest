package com.test.java.di03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		//직접 생성
		Hong hong1 = new Hong();
		
		//스프링을 통해 생성
		//스프링 컨테이너 == oo 컨텍스트
		//org.springframework.context 패키지
//		ApplicationContext context = new ClassPathXmlApplicationContext("/src/main/java/com/test/java/di03/di03.xml"); 
		ApplicationContext context = new ClassPathXmlApplicationContext("com/test/java/di03/di03.xml");
		
		//bean 1개 생성, new Hong() 호출
		Hong hong2 = (Hong)context.getBean("hong");
		
		hong1.work();
		hong2.work();
		
//		System.out.println(hong1.hashCode());
//		System.out.println(hong2.hashCode());
		
		Lee lee = (Lee)context.getBean("lee");
		lee.work();
		
//		System.out.println(lee.hashCode());
		
	}
}
