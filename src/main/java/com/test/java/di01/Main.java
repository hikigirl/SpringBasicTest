package com.test.java.di01;

public class Main {
	public static void main(String[] args) {
		//����
		//Main(����) - Service(����) - Hong(����)
		
		//��ü ���� ����
		//1. Hong
		//2. Service
		//3. Main
		
		//Main -> (����) -> Service -> (����) -> Hong
		//Main -> (����) -> Service -> (����) -> Hong
		
		//Hong -> ���
		//Lee -> �Ի�
		
		//Hong�� Lee�� ������μ��� �ٸ� ���, �������μ��� ���� ������ �ϴ� ����
		
		//***���±����� ���
		//�ʿ�� �ϴ� ���� ��ü�� ���� ����+����ϴ� ���
		
		//***������ ���
		//�ʿ�� �ϴ� ���� ��ü�� ���� �������� ����
		//�ܺηκ��� ���� ��ü�� ����+����ϴ� ���
		
		System.out.println("�������1");

		//main�� service�� ���� ����
		//Service service = new Service();
		//service.doSomething();
		
		//Service�� ���� ��ü Hong
		//Hong hong = new Hong();
		
		//Service ���� + ���� ��ü ����
//		Service service = new Service(hong); //���� ����(DI)
//		service.doSomething();
		
//		Service service = new Service();
//		service.setHong(hong); //���� ����(DI) �߻�
//		service.doSomething();
		
		Lee lee = new Lee();
		Service service = new Service(lee); //���� ����(DI)
		service.doSomething();
		
		System.out.println("�������2");
		
	}
}
