package com.test.java.di02;

public class Service {
	
	private Employee employee;
	
	
	public Service(Employee employee) { //������ ���� ���� ����
		this.employee = employee;
	}
	
	public void doSomething() {
		//���� �ڽ��� ����
		System.out.println("�ڷḦ ����");

		//DI
		//hong.work();
		//lee.work();
		employee.work();
		
		
		//���� �ڽ��� ����
		System.out.println("�ڷḦ ����");
	}
}
