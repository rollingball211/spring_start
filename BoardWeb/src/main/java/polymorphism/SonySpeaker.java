package polymorphism;

public class SonySpeaker implements Speaker {

	public SonySpeaker() {
		System.out.println("SonySpeaker Object created!");
	}
	public void volumeUp() {
		System.out.println("Volume up");
	}
		
	public void volumeDown() {
		
		System.out.println("Volume Down");
	}
	}
