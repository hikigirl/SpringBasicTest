package com.test.java.di01;

public class Service {
	
	//1. DI 패턴 - 의존 객체를 담을 멤버 변수를 선언한다.
	private Hong hong;
	private Lee lee;
	
	//2. DI 패턴 - 의존 객체를 주입받는다. 
	//			 - 의존 주입 도구를 선언한다.(생성자 or setter)
	
	public Service(Hong hong) { //생성자 의존 주입 도구
		this.hong = hong;
	}
	
	public Service (Lee lee) {
		this.lee = lee;
	}
//	public void setHong(Hong hong) {
//		this.hong = hong;
//	}
	
	public void doSomething() {
		//서비스 자신의 업무
		System.out.println("자료를 취합");

		//일부 업무를 Hong에게 위임
		//service와 hong은 의존 관계
		//의존 객체를 스스로 만드는 방식
//		Hong hong = new Hong();
//		hong.work();
		
//		Lee lee = new Lee();
//		lee.work();
		
		
		//DI
		//hong.work();
		lee.work();
		
		
		//서비스 자신의 업무
		System.out.println("자료를 전송");
	}
}
