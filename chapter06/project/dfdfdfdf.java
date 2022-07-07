package chapter6.project;

public class dfdfdfdf {

	public void setHour(int hour) {

		if (hour < 0 || hour > 24) {
			this.hour = 0;
			return;
		} else {
			this.hour = hour;
		}
	}

	public void setMinute(int minute) {
		if (minute < 0 || minute > 60) {
			this.minute = 0;
			return;
		} else {
			this.minute = minute;

		}
	}

	public void setSecond(int second) {

		if (second < 0 || second > 60) {
			this.second = 0;
			return;
		} else {
			this.second = second;
		}
	}
}
