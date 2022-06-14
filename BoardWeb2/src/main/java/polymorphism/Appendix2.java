package polymorphism;

public class Appendix2 {

	/*
	 <bean> element attributes.
	 1. init-method 속성
	 Spring Container은 설정 파일에 등록된 클래스를 객체 생성할 때 디폴트 생성자를 호출함.
	 따라서 멤버변수 초기화 작업이 필요하다면, <bean> element에 init-method 속성을 사용한다.
	 <bean id= "tv" class= "~~" init-method="initMethod"/>
	 
	 2. destroy-method 속성
	 이 속성을 이용해 객체를 삭제하기 직전 호출될 메소드를 지정 가능함.
	 <bean id= "tv" class= "~~" destroy-method="destroyMethod"/>
	 
	 3. lazy-init
	 해당 <bean>이 사용되는 시점에 객체를 생성할수 있도록 제공.
	 <bean id= "tv" class= "~~" lazy-init="true"/>
	 메모리 관리 효율적으로 가능.
	 
	 4.scope 
	 Container가 생성한 bean을 어느 범위에서 사용할 수 있는지를 지정함.
	 scope 속성값은 기본이 singleton, 해당 bean이 스프링 컨테이너에 의해 단 하나만 생성되어 운용하게 함.
	 <bean id= "tv" class= "~~" scope="singleton"/>
	 
	 branch-changes.
	 */
}
