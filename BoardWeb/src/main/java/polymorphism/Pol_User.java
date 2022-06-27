package polymorphism;

/*
Solution?
1. PolyMorphism(다형성 이용)
Interface를 이용해 method를 강제하면서 형변환(Promotion)을 사용한다면,
객체만 수정하면 되므로 유지보수가 한결 쉬워짐.
*/
public class Pol_User {

	public static void main(String[] args) {

		//SamsungTV tv = new SamsungTV();
		Pol_LgTV tv = new Pol_LgTV(); //tv의 객체를 만듬
		
		tv.PowerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.PowerOff();
		
	}
	
	

}
