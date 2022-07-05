
public class AOP {
//APPEDNIX 1 - AOP(Aspect Oriented Programming)
	/*
	 새로운 메소드를 구현하는 일반적인 방법-
	 기존 메소드를 복사해서 구현
	 
	 ******
	 * AOP 용어
	1.  관심 분리  (Seperation of Concerns)
	  AOP에서, 메소드마다 공통으로 등장하는 로깅,예외,트랜젝션 처리등을 횡단 관심
	 (Crosscutting Concerns)라고 함.
	 
	 사용자의 요청에 따라 실제로 수행되는 핵심 비즈니스 로직- 핵심 관심
	 (Core Concerns)

	2. 조인 포인트(JOINPOINT)
	클라이언트가 호출하는 모든 비즈니스 메소드
	포인트컷 후보라고도 함
	
	3. 포인트컷(POINTCUT)
	필터링된 조인포인트. 원하는 특정 메소드에서만 횡단 관심을 수행시키기 위해 필요함.
	(메소드 지정)
	
	expression 속성에 따라 필터링되는 메소드가 달라짐.
	
	4. 어드바이스(Advice)
	횡단 관심에 해당하는 공통 기능의 코드를 의미함.
	독립된 클래스의 메소드로 작성. 언제 동작할지 스프링 설정파일을 통해 지정 가능.
	
	5.위빙(Weaving)
	
	포인트컷으로 지정한 핵심 관심 메소드가 호출될 때, 어드바이스에 해당하는 횡단관심 메소드가
	삽입되는 과정을 의미함.
	비즈니스 메소드를 수정하지 않고도 기능 추가 /변경 가능
	
    6.Aspect / Advisor
    Aspect = pointCut + Advisor
    어떤 포인트컷 메소드에 따라 어떤 어드바이스 메소드를 실행할지 결정함.
	
	 
	 */
}
