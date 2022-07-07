package chapter6.project;

public class Time {
	// 필드
	private int hour;
	private int minute;
	private int second;

	// 생성자
	public Time() {
	}

	public Time(int hour, int minute, int second) {
		this.hour = hour;
		if (hour < 0 || hour > 24) {
			this.hour = 0;
		}
		this.minute = minute;
		if (minute < 0 || minute > 60) {
			this.minute = 0;
		}
		this.second = second;
		if (second < 0 || second > 60) {
			this.second = 0;
			return;
		}
	}

//getter메서드 : 변수의 값을 읽어 가게끔 해줌
//setter메서드 : 변수의 값을 저장하거나 수정하거나 해줌
	// 메서드
//인스턴스의 필드가 어떤 값을 갖고 있는지 확인할 수 있는 메소드
	public String toString() {
		//system.out.printf(); 와 같음
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
}
