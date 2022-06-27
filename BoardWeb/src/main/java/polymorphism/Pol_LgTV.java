package polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("tv") // = <bean id = "tv" class = polymorphism.Pol_LgTV"></bean>
public class Pol_LgTV implements TV {
// Polymorph를 이용할 클래스들은 interface TV를 구현한다.
	
	@Autowired
	private Speaker speaker;
	
	public Pol_LgTV() {
		System.out.println("POL_LGTV 객체 생성");
	}
	
	public void PowerOn() {
		System.out.println("LG티비------전원 on");
		
	}
	public void PowerOff() {
		System.out.println("LG티비--------전원off");
		
	}
	
	public void volumeUp() {
		speaker.volumeUp();
		
	}
	
	public void volumeDown() {
		speaker.volumeDown();
	}
	
}
