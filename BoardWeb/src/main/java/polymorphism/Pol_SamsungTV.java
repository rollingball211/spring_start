package polymorphism;


public class Pol_SamsungTV implements TV {

	// Polymorph�� �̿��� Ŭ�������� interface TV�� �����Ѵ�.
	private SonySpeaker speaker;
	
	public Pol_SamsungTV() {
		System.out.println("=> SamsungTV ��ü ���� ");
	}

	public void PowerOn() {
		System.out.println("�ＺƼ��------���� on");
		
	}
	public void PowerOff() {
		System.out.println("�ＺƼ��--------����off");
		
	}
	
	public void volumeUp() {
		speaker = new SonySpeaker();
		System.out.println("�ＺƼ��--------�Ҹ��ø�");
		
	}
	
	public void volumeDown() {
		speaker = new SonySpeaker();
		System.out.println("�ＺƼ��-------�Ҹ�����");
	}
}
