package polymorphism;


public class Pol_SamsungTV implements TV {

	// Polymorph�� �̿��� Ŭ�������� interface TV�� �����Ѵ�.
	
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
		System.out.println("�ＺƼ��--------�Ҹ��ø�");
		
	}
	
	public void volumeDown() {
		System.out.println("�ＺƼ��-------�Ҹ�����");
	}
}
