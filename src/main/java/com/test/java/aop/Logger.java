package com.test.java.aop;

import java.util.Calendar;

import org.aspectj.lang.ProceedingJoinPoint;

//���� ���� -> �α� ���
public class Logger {
	//���� ���� ����
	public void log() {
		Calendar now = Calendar.getInstance();
		System.out.printf("[%tF %tT] �α׸� ����մϴ�.\n", now, now);
	}
	
	//around advice�� ����� �޼��� �߰�����
	public void around(ProceedingJoinPoint jp) {
		//Ư�� ������ ����Ǵ� �ҿ� �ð�
		System.out.println("�� ���� ���� ��");
		long begin = System.nanoTime();
		
		//�� ���� ����
		// -> ���Ͻ� ��ü(Proxy Object) => jp
		try {
			jp.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
		//System.out.println("�� ���� ���� ����");
		long end = System.nanoTime();
		System.out.println("�ҿ�ð�: " + (end-begin) + "ns");
	}
}
