package com.test.java.di04;

public class Service {
	
	private Employee employee;
	
	
//	public Service(Employee employee) { //������ ���� ���� ����
//		this.employee = employee;
//	}
	
	//setter�� �̿��� ���� ����
	public void setEmployee(Employee employee) {
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
