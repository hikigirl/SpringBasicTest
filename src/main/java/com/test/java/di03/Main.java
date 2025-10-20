package com.test.java.di03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		//���� ����
		Hong hong1 = new Hong();
		
		//�������� ���� ����
		//������ �����̳� == oo ���ؽ�Ʈ
		//org.springframework.context ��Ű��
//		ApplicationContext context = new ClassPathXmlApplicationContext("/src/main/java/com/test/java/di03/di03.xml"); 
		ApplicationContext context = new ClassPathXmlApplicationContext("com/test/java/di03/di03.xml");
		
		//bean 1�� ����, new Hong() ȣ��
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
