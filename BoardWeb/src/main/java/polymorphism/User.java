package polymorphism;

public class User {

	public static void main(String[] args) {

		SamsungTV tv = new SamsungTV();
		LgTV tv1 = new LgTV(); //tv�� ��ü�� ����
		
		tv.PowerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.PowerOff();
		
		tv1.PowerOn();
		tv1.volumeUp();
		tv1.volumeDown();
		tv1.PowerOff();
		
	}
	
	/*
	  Method signature is different.
	  User�� tv�� �ٲٷ��� �ϸ� ���������� ����. �߰�/���� �ؾ��ϱ� ����
	  
	  Solution?
	  1. PolyMorphism(������ �̿�)
	 */

}
