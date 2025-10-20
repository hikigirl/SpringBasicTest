# BasicTest

## Spring Legacy 기초 이론

- new - spring legacy project - spring mvc project
- project name: `BasicTest`
- root package: `com.test.java`

---

#### 패키지

- src/main/java > com.test.java.di01
    - Main.java
    - Service.java
    - Hong.java
    - Lee.java
- src/main/java > com.test.java.di02
	- Main.java
	- Service.java
	- Hong.java
	- Lee.java
	- Employee.java(I)
- src/main/java > com.test.java.di03
    - Main.java
    - Service.java
    - Hong.java
    - Lee.java
    - Employee.java(I)
    - di03.xml : 스프링 설정 파일
- src/main/java > com.test.java.aop
	- Main.java
	- Memo.java(I)
	- MemoImpl.java(C) : 메모 객체 > 주업무
	- Logger.java : 로그 객체 > 보조업무					
	- memo.xml : 스프링 설정 파일