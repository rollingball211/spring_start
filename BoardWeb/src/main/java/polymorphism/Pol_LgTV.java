package polymorphism;

public class Pol_LgTV implements TV {
// Polymorph�� �̿��� Ŭ�������� interface TV�� �����Ѵ�.
	
	public void PowerOn() {
		System.out.println("LGƼ��------���� on");
		
	}
	public void PowerOff() {
		System.out.println("LGƼ��--------����off");
		
	}
	
	public void volumeUp() {
		System.out.println("LGƼ��--------�Ҹ��ø�");
		
	}
	
	public void volumeDown() {
		System.out.println("LGƼ��-------�Ҹ�����");
	}
}
