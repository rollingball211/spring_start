package polymorphism;

public class AppleSpeaker implements Speaker{

	public AppleSpeaker() {
		System.out.println("AppleSpeaker ��ü ����");
	}
	@Override
	public void volumeUp() {
		System.out.println("appleSpeaker �Ҹ� �ø�");
		
	}@Override
	public void volumeDown() {
		System.out.println("appleSpeaker �Ҹ� ����");
		
	}
}