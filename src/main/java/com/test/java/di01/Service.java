package com.test.java.di01;

public class Service {
	
	//1. DI ���� - ���� ��ü�� ���� ��� ������ �����Ѵ�.
	private Hong hong;
	private Lee lee;
	
	//2. DI ���� - ���� ��ü�� ���Թ޴´�. 
	//			 - ���� ���� ������ �����Ѵ�.(������ or setter)
	
	public Service(Hong hong) { //������ ���� ���� ����
		this.hong = hong;
	}
	
	public Service (Lee lee) {
		this.lee = lee;
	}
//	public void setHong(Hong hong) {
//		this.hong = hong;
//	}
	
	public void doSomething() {
		//���� �ڽ��� ����
		System.out.println("�ڷḦ ����");

		//�Ϻ� ������ Hong���� ����
		//service�� hong�� ���� ����
		//���� ��ü�� ������ ����� ���
//		Hong hong = new Hong();
//		hong.work();
		
//		Lee lee = new Lee();
//		lee.work();
		
		
		//DI
		//hong.work();
		lee.work();
		
		
		//���� �ڽ��� ����
		System.out.println("�ڷḦ ����");
	}
}
