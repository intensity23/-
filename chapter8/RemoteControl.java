package chapter8;

//클래스 : 클래스 --> 상속
//인터페이스 : 클래스 --> 구현
public interface RemoteControl {
	public int MAX_VOLUME = 10;
	
	public int MIN_VOLUME = 0;
	
	void turnOn();
	void turnOff();
	void setVolume(int volume);

}
