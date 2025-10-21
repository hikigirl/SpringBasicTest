package com.test.java.di02;

public class Service {
	
	private Employee employee;
	
	
	public Service(Employee employee) { //생성자 의존 주입 도구
		this.employee = employee;
	}
	
	public void doSomething() {
		//서비스 자신의 업무
		System.out.println("자료를 취합");

		//DI
		//hong.work();
		//lee.work();
		employee.work();
		
		
		//서비스 자신의 업무
		System.out.println("자료를 전송");
	}
}
