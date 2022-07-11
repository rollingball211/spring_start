package aop;

public class AOP3 {

	/*
	  AOP 엘리먼트
	  
	  AOP 관련 설정 => 마찬가지로 XML / ANNOTATION
	  
	  구조도
	  <aop:config> /root element, 여러번 사용 가능
	    <aop:pointcut> or <aop:aspect>
	  </aop:config>
	    
	    
	  <aop:poincut>
	   포인트컷을 지정하기 위해 사용, <aop:config>의 자식 / <aop:aspect>의 자식으로 사용가능
	   <aop:aspect> 하위에 설정된포인트컷은 해당 <aop:aspect>에서만 사용 가능
	   <aop:pointcut>은 여러개 정의할수 있으며, 유일한 아이디를 할당하여 애스펙트 설정시 
	   포인트컷 참조용으로 사용함.
	   
	   여러개 정의가 가능하며 유일한 아이디를 할당하여 애스팩트를 설정할 때 포인트컷 참조하는 용도로 사용
	   
	   
	   <aop:aspect>
	   포인트컷 메소드와 횡단 관심에 해당하는 어드바이스 메소드를 결합하기 위해 사용
	   
	   <aop:advisor>
	  	트랜젝션 처리에 사용
	  	
	   	 */
}
