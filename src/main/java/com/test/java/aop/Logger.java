package com.test.java.aop;

import java.util.Calendar;

import org.aspectj.lang.ProceedingJoinPoint;

//보조 업무 -> 로그 기록
public class Logger {
	//보조 업무 구현
	public void log() {
		Calendar now = Calendar.getInstance();
		System.out.printf("[%tF %tT] 로그를 기록합니다.\n", now, now);
	}
	
	//around advice에 사용할 메서드 추가구현
	public void around(ProceedingJoinPoint jp) {
		//특정 업무가 실행되는 소요 시간
		System.out.println("주 업무 시작 전");
		long begin = System.nanoTime();
		
		//주 업무 실행
		// -> 프록시 객체(Proxy Object) => jp
		try {
			jp.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
		//System.out.println("주 업무 종료 직후");
		long end = System.nanoTime();
		System.out.println("소요시간: " + (end-begin) + "ns");
	}
}
