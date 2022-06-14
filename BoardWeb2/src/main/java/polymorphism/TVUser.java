package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
public class TVUser {
	
	
	public static void main(String[] args) {
		
		//1. Spring 컨테이너 구동
		AbstractApplicationContext factory =
				new GenericXmlApplicationContext("applicationContext.xml");
		
		//2. Spring 컨테이너로부터 필요한 객체를 요청(LookUp) 함
		TV tv = (TV)factory.getBean("tv");
		tv.PowerOn();
		tv.volumeDown();
		tv.volumeUp();
		tv.PowerOff();
		
		//3. Spring 컨테이너 종료.
		factory.close();
	
		/*
		 * Spring IoC 컨테이너가 관리하는 자바 객체를 빈(Bean)이라 함.
		 1. TVUser 클라이언트가 스프링 설정 파일을 로딩, 컨테이너 구동
		 2. 스프링 설정 파일에 <bean> 등록된 SamsungTV 객체 생성
		 3. getBean() 메소드로 이름이 'tv'인 객체를 요청(LookUp)
		 4. SamsungTv 객체 반환
		 
		 */
		
		/*
		 Spring Container 종류
		 1. BeanFactory , ApplicationContext 두 가지 유형 컨테이너 제공
		 
		 BeanFactory
		 1.Spring 설정 파일에 등록된 <bean> 객체 생성,관리하는 가장 기본적인 기능 제공
		 2.클라이언트의 요청에 의해서만 <bean> 객체가 생성되는 지연 로딩 방식 사용.
		 
		 ApplicationContext 
		 BeanFactory의 기능 
		 트랜젝션 관리 , 컨테이너가 구동되는 시점에 bean 등록된 클래스들을 객체 생성하는 
		 즉시 로딩 방식 사용.
		 
		 GenericXmlApplicationContext - 파일시스템/클래스경로에 있는 xml 설정 파일 로딩하여 구동
		 
		 XmlWebApplicaitonContext  - 웨 기반의 스프링 어플리케이션 개발할 때 사용.
		 */
	}

}
