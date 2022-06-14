package polymorphism;

public class Pol_LgTV implements TV {
// Polymorph를 이용할 클래스들은 interface TV를 구현한다.
	
	public void PowerOn() {
		System.out.println("LG티비------전원 on");
		
	}
	public void PowerOff() {
		System.out.println("LG티비--------전원off");
		
	}
	
	public void volumeUp() {
		System.out.println("LG티비--------소리올림");
		
	}
	
	public void volumeDown() {
		System.out.println("LG티비-------소리내림");
	}
}
