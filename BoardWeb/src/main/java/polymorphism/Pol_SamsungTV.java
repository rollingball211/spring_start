package polymorphism;


public class Pol_SamsungTV implements TV {

	// Polymorph�� �̿��� Ŭ�������� interface TV�� �����Ѵ�.
	private Speaker speaker;
	
	public Pol_SamsungTV() {
		System.out.println("=> SamsungTV(1) ��ü ���� ");
	}
	
	public Pol_SamsungTV(Speaker speaker) {
		System.out.println("=> SamsungTV(2) ��ü ���� ");
		this.speaker = speaker;
	}
	

	public void PowerOn() {
		System.out.println("�ＺƼ��------���� on");
		
	}
	public void PowerOff() {
		System.out.println("�ＺƼ��--------����off");
		
	}
	
	public void volumeUp() {
		speaker.volumeUp();
		
	}
	
	public void volumeDown() {
		speaker.volumeDown();
	}
	/*
	 spring container�� �⺻������ bean�� ��ϵ� ������� ��ü�� ������
	 constructor-arg�� ������ id�� ref�Ӽ����� ������
	 ������ ������ �� ��ü�� ���� �����Ǿ� (2)�� ������.
	 
	 3. ���� ���� ����
	 �ʱ�ȭ�ؾ� �� ���� �������̸�, �����ڸ� �����ϰ� �߰��ϸ� ��.
	 ������ ���� ���Ͽ� �߰��ϸ� ��.
	 
	ref / value?
	���ڷ� ���޵� �����Ͱ� bean���� ��ϵ� �ٸ� ��ü�϶� => REF
	������ ���ڿ�/���� �⺻�������� => VALUE
	�����ڰ� ������ �����ε� �Ǿ��ִٸ� , index �Ӽ��� �̿�, 0���� ���� 
	 
	 xml ������ beanId�� ������ ��ü�ϸ� (ex:appleSpeaker) ����Ǵ� ����Ŀ�� �����.
	 */
}
