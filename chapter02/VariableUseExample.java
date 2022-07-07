package chapter02;

public class VariableUseExample {
	public static void main(String[] args) {
		int hour = 12;
		int minute = 11;
		System.out.println(hour + "시간" + minute + "분");
		int totalminute = hour * 60 + minute;
		System.out.println(totalminute + "분");
	}
}
