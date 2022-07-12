package aop;

public class AOP4 {

	/*
	 	JoinPoint 인터페이스 제공 => 메소드가 속한 클래스와 패키지 정보를 알기 위해 제공
	 	
	 	JoinPoint method
	 	
	 	Signature getSignature()
	 	
	 	=> 클라이언트가 호출한 메소드의 시그니처(리턴타입,이름,,매개변수) 정보가 저장된
	 	Signature 객체 리턴
	 	
	 	Object getTarget() 클라이언트가 호출한 비즈니스 메소드를 포함하는 비즈니스 객체 리턴
	 	
	 	Object getArgs() 클라이언트가 메소드 호출할 때 넘겨준 인자 목록 Object 배열로 리턴
	 	
	 	Around advice는 proceed() 메소드 필요함.
	 	
	 	getSignature() 가 제공하는 메소드
	 	
	 	1. getName() 클라이언트가 호출한 메소드 이름 리턴
	 	2. toLongString() 클라이언트가 호출한 메소드의 리턴타입,이름,매개변수를
	 	패키지 경로까지 포함하여 리턴
	 	3. toShortString() 클라이언트가 호출한 메소드 시그니처를 축약한 문자열로 리턴.
	 
	 	JoinPoint jp => before
	 	Joinpoint jp , Object returnObj => after returning
	 	Joinpoint jp , Exception exceptObj => after throwing
	 	ProceedingJoinpoint pjp => Around
	 */
}
