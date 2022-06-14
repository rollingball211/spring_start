package polymorphism;

public class Appendix1 {

/*
 스프링 XML 설정
 
 1.<beans> 루트 엘리먼트
 스프링 컨테이너
 => <bean> 저장소에 해당하는 XML 설정 파일을 참조하여 <bean>의 생명주기를 관리함
 설정 파일을 정확하게 관리하는 게 중요
 
 <beans>를 root element로 사용해야 함.
 
 2. <import> element
   기능별로 여러 XML 파일로 나누어 설정하는게 효율성이 좋음
   => 분리하여 나눠진 설정 파일들을 하나로 통합할 때, <import> element 사용.
   여러 스프링 설정 파일을 포함함으로써, 한 파일에 작성하는 것과 같은 효과를 낼 수 있음.
   
 3. <bean> element
 스프링 설정 파일에 클래스 등록 => bean element 사용
 id, class 속성 사용, id는 생략 가능.
 class 속성에 클래스 등록 시에는 정확한 패키지 경로와 클래스 이름을 지정해야 함.
 
 ex) <beans xmlns=~~..
                    >
     <bean class = package.ClassName></bean>
  </beans>
  
  bean 객체를 위한 이름을 지정할 때 사용하는 속성이 id이다.
  컨테이너가 식별할 수 있게 하는 유일한 속성.
  
  id는 숫자로 시작, 공백 포함, 특수기호 사용 하면 에러 발생.
  특수기호가 포함된 아이디를 bean 아이디로 지정할때는 id 대신 name 속성을 사용함.
  name 속성값 역시 스프링 파일 내에서 유일해야 함. 
  
 */
}
