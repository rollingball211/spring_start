package polymorphism;
/*
Method signature is different.
User�� tv�� �ٲٷ��� �ϸ� ���������� ����. �߰�/���� �ؾ��ϱ� ����

Solution?
1. PolyMorphism(������ �̿�)
*/
public class BeanUser {

	public static void main(String[] args) {
		BeanFactory factory = new BeanFactory();
		TV tv = (TV)factory.getBean(args[0]); //����ȯ
		
		tv.PowerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.PowerOff();
		
		
	}
	
	//github config ����..
	//Ŀ���׽�Ʈ.. ��Ʃ�� ������ �ǳ�?

}
