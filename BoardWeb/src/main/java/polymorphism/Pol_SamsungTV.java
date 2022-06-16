package polymorphism;


public class Pol_SamsungTV implements TV {

	// Polymorph를 이용할 클래스들은 interface TV를 구현한다.
	private Speaker speaker;
	
	public Pol_SamsungTV() {
		System.out.println("=> SamsungTV(1) 객체 생성 ");
	}
	
	public Pol_SamsungTV(Speaker speaker) {
		System.out.println("=> SamsungTV(2) 객체 생성 ");
		this.speaker = speaker;
	}
	

	public void PowerOn() {
		System.out.println("삼성티비------전원 on");
		
	}
	public void PowerOff() {
		System.out.println("삼성티비--------전원off");
		
	}
	
	public void volumeUp() {
		speaker.volumeUp();
		
	}
	
	public void volumeDown() {
		speaker.volumeDown();
	}
	/*
	 spring container는 기본적으로 bean에 등록된 순서대로 객체를 생성함
	 constructor-arg에 전달할 id를 ref속성으로 참조함
	 의존성 주입이 된 객체가 먼저 생성되어 (2)가 생성됨.
	 
	 3. 다중 변수 매핑
	 초기화해야 할 값이 여러개이면, 생성자를 적절하게 추가하면 됨.
	 스프링 설정 파일에 추가하면 됨.
	 
	ref / value?
	인자로 전달될 데이터가 bean으로 등록된 다른 객체일때 => REF
	고정된 문자열/정수 기본형데이터 => VALUE
	생성자가 여러개 오버로딩 되어있다면 , index 속성을 이용, 0부터 시작 
	 
	 xml 파일의 beanId를 적절히 교체하면 (ex:appleSpeaker) 실행되는 스피커가 변경됨.
	 */
}
