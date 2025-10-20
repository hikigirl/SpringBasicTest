package com.test.java.di01;

public class Main {
	public static void main(String[] args) {
		//조직
		//Main(사장) - Service(팀장) - Hong(팀원)
		
		//객체 생성 순서
		//1. Hong
		//2. Service
		//3. Main
		
		//Main -> (위임) -> Service -> (위임) -> Hong
		//Main -> (의존) -> Service -> (의존) -> Hong
		
		//Hong -> 퇴사
		//Lee -> 입사
		
		//Hong과 Lee는 사람으로서는 다른 사람, 직원으로서는 같은 역할을 하는 직원
		
		//***여태까지의 방식
		//필요로 하는 의존 객체를 직접 생성+사용하는 방식
		
		//***이후의 방식
		//필요로 하는 의존 객체를 직접 생성하지 않음
		//외부로부터 의존 객체를 주입+사용하는 방식
		
		System.out.println("사장업무1");

		//main과 service는 의존 관계
		//Service service = new Service();
		//service.doSomething();
		
		//Service의 의존 객체 Hong
		//Hong hong = new Hong();
		
		//Service 생성 + 의존 객체 주입
//		Service service = new Service(hong); //의존 주입(DI)
//		service.doSomething();
		
//		Service service = new Service();
//		service.setHong(hong); //의존 주입(DI) 발생
//		service.doSomething();
		
		Lee lee = new Lee();
		Service service = new Service(lee); //의존 주입(DI)
		service.doSomething();
		
		System.out.println("사장업무2");
		
	}
}
