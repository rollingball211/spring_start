package polymorphism;


public class Pol_SamsungTV implements TV {

	// Polymorph를 이용할 클래스들은 interface TV를 구현한다.
	private SonySpeaker speaker;
	
	public Pol_SamsungTV() {
		System.out.println("=> SamsungTV 객체 생성 ");
	}

	public void PowerOn() {
		System.out.println("삼성티비------전원 on");
		
	}
	public void PowerOff() {
		System.out.println("삼성티비--------전원off");
		
	}
	
	public void volumeUp() {
		speaker = new SonySpeaker();
		System.out.println("삼성티비--------소리올림");
		
	}
	
	public void volumeDown() {
		speaker = new SonySpeaker();
		System.out.println("삼성티비-------소리내림");
	}
}
