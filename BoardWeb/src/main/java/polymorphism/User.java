package polymorphism;

public class User {

	public static void main(String[] args) {

		SamsungTV tv = new SamsungTV();
		LgTV tv1 = new LgTV(); //tv의 객체를 만듬
		
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
	  User가 tv를 바꾸려고 하면 유지보수가 힘듬. 추가/변경 해야하기 때문
	  
	  Solution?
	  1. PolyMorphism(다형성 이용)
	 */

}
