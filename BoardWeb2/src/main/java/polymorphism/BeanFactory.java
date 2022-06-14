package polymorphism;
/*
  2. 결합도 낮추기 => design pattern 
  Factory Pattern
  1. 클라이언트에서 사용할 객체 생성을 캡슐, User와 TV 사이를 느슨한 결합상태로 만듬.
  2. BeanFactory 클래스의 getBean()은 매개변수로 받은 beanName에 해당하는 객체를 만들어 리턴
 */
public class BeanFactory {

	public Object getBean(String beanName) {
		if (beanName.equals("samsung")) {
			return new Pol_SamsungTV();
		} else if (beanName.equals("lg")) {
			return new Pol_LgTV();
		}
		return null;
	}
	
}
