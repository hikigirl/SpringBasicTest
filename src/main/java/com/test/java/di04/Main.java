package com.test.java.di04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		//���� �۾� => service�� �����ؼ� service ��ü ����
		//���� �ڹ� + DI ����
//		Hong hong = new Hong();
//		Service service = new Service(hong);
//		service.doSomething();
		
		//������ + DI ����
		ApplicationContext context = new ClassPathXmlApplicationContext("com/test/java/di04/di04.xml");
//		Hong hong2 = (Hong)context.getBean("hong");
//		
//		Service service2 = new Service(hong);
//		service2.doSomething();
		
		Service service3 = (Service)context.getBean("service");
		service3.doSomething();
		
		Hong hong4 = (Hong)context.getBean("hong");
		Hong hong5 = (Hong)context.getBean("student");
		Hong hong6 = (Hong)context.getBean("obj");
		Hong hong7 = (Hong)context.getBean("dao");
		
		hong4.work();
		hong5.work();
		hong6.work();
		hong7.work();
		
	}
}
