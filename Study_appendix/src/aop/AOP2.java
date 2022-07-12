package aop;

public class AOP2 {

	/*
	 1. 포인트컷 선언
	 	<aop:pointcut id =" getPointcut"
	 	  expression = "execution ( *com.springbok.biz..*Impl.get*(..))"/>
	 	  맨 앞 * = return type
	 	  com~biz = package path
	 	  *Impl = class name
	 	  get*(..); = method name/ parameters
	 	  
	 	  <aop:aspect ref = "log">
	 	  	<aop:before pointcut-ref ="pointcutId" method = " "/>
	 	  	...
	 	  	
	 	  	pointcut-ref id를 getPointcut로 바꾸면 get으로 시작하는 getBoardList()에 반응
	 	  	
	 	  	
	 2. advice 선언
	 => 횡단 관심에 해당하는 공통 기능의코드, 독립된 클래스의 메소드로 작성.
	
		spring에서는 advice의 동작 시점을 지정 가능. 
		before
		after
		after-returning
		after-throwing
		around

		
		before <aop:before>
		메소드 실행 전 처리될 내용 기술하기 위해 사용.
		
		after <aop:after>
		try-catch-finally 처럼
		예외 발생 여부에 상관없이 무조건 수행되는 어드바이스 등록 시 사용.
		
		after returning <aop:after-returning>
		포인트컷으로 지정된 메소드 실행 후 , 수행 결과로 생성된 데이터를 리턴하는 시점에 동작
		보통 사후처리 로직 추가시 사용. 
		
		after-throwing <aop:after-throwing>
		예외가 발생하는 시점에 동작함.
		
		around
		특정 어드바이스가 메소드 실행전과 후에 모두 동작
		
		<aop:aspect ref = "log">
	 	  	<aop:after pointcut-ref ="getPointcut" method = "printLog"/>
	 	  	...
	 	  
	 	 출력: getBoardList() 메소드 실행후 printLog() 메소드 실행 완료.
	 	 
	 
	 3. Aspect/Advisor 
	    Aspect = pointCut + advisor
	    어떤 포인트컷 메소드에 따라 어떤 어드바이스 메소드 실행할지 결정함.
	    트랜젝션 설정에선 <aop:advisor> 사용
	 	 
	 
	 (1) 조인포인트를 호출
	 (2) 특정 포인트컷으로 지정한 메소드 호출
	 (3) 그 순간 어드바이스 객체의 어드바이스 호출 동작 시점 5개 지정 가능
	 (4) 포인트컷으로 지정한 메소드 호출될 때, 어드바이스 메소드 삽입하게 하는 설정 = 에스팩트
	 (5) 에스팩트 설정에 따라 위빙 처리
		
	 */
}
