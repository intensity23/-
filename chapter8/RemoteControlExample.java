package chapter8;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl tv = new Television();
		tv.turnOn();
		tv = new Audio();
		tv.setVolume(10);
		tv.turnOn();
		tv = new Television();
		tv.turnOff();
		tv.setVolume(100);
		tv = new Audio();
		tv.turnOff();
	}
}
