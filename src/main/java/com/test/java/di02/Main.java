package com.test.java.di02;

public class Main {
	public static void main(String[] args) {
		
		System.out.println("사장업무1");

		
		//Hong
		Employee hong = new Hong();
		Service service = new Service(hong);
		service.doSomething();
		//Lee
		Employee lee = new Lee();
		Service service2 = new Service(lee);
		service2.doSomething();
		
		
		System.out.println("사장업무2");
		
	}
}
