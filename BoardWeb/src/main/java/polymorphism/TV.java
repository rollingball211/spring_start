package polymorphism;

public interface TV {

	public void PowerOn();
	public void PowerOff();
	public void volumeUp();
	public void volumeDown();
	//error occured?
}

//1. 다형성을 이용하기 위해 TV들이 공통으로 가져야 할 Method들을 abstract method로 선언.

