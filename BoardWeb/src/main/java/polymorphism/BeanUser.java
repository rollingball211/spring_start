package polymorphism;
/*
Method signature is different.
User가 tv를 바꾸려고 하면 유지보수가 힘듬. 추가/변경 해야하기 때문

Solution?
1. PolyMorphism(다형성 이용)
*/
public class BeanUser {

	public static void main(String[] args) {
		BeanFactory factory = new BeanFactory();
		TV tv = (TV)factory.getBean(args[0]); //형변환
		
		tv.PowerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.PowerOff();
		
		
	}
	
	//github config 에러..
	//커밋테스트.. 유튜브 계정도 되나?

}
