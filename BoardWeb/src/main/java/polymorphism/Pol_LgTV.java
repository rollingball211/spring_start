package polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("tv") // = <bean id = "tv" class = polymorphism.Pol_LgTV"></bean>
public class Pol_LgTV implements TV {
// Polymorph�� �̿��� Ŭ�������� interface TV�� �����Ѵ�.
	
	@Autowired
	private Speaker speaker;
	
	public Pol_LgTV() {
		System.out.println("POL_LGTV ��ü ����");
	}
	
	public void PowerOn() {
		System.out.println("LGƼ��------���� on");
		
	}
	public void PowerOff() {
		System.out.println("LGƼ��--------����off");
		
	}
	
	public void volumeUp() {
		speaker.volumeUp();
		
	}
	
	public void volumeDown() {
		speaker.volumeDown();
	}
	
}
