package polymorphism;

/*
Solution?
1. PolyMorphism(������ �̿�)
Interface�� �̿��� method�� �����ϸ鼭 ����ȯ(Promotion)�� ����Ѵٸ�,
��ü�� �����ϸ� �ǹǷ� ���������� �Ѱ� ������.
*/
public class Pol_User {

	public static void main(String[] args) {

		//SamsungTV tv = new SamsungTV();
		Pol_LgTV tv = new Pol_LgTV(); //tv�� ��ü�� ����
		
		tv.PowerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.PowerOff();
		
	}
	
	

}
