package polymorphism;

/*
 결합도 (Coupling)이 높은 프로그램
 
 */
public class SamsungTV {

	public void PowerOn() {
		System.out.println("삼성티비------전원 on");
		
	}
	public void PowerOff() {
		System.out.println("삼성티비--------전원off");
		
	}
	
	public void volumeUp() {
		System.out.println("삼성티비--------소리올림");
		
	}
	
	public void volumeDown() {
		System.out.println("삼성티비-------소리내림");
	}
}
