package polymorphism;

public interface Speaker {

	/*
	 2. 의존관계 변경. (유지보수 과정에서 다른 스피커로 교체하는 상황이 있을것)
	 (alt + shift + t + extract interface)
	 
	 */
	void volumeUp();
	void volumeDown();
	
}
