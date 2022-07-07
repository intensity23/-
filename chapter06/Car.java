package chapter6;

public class Car {
	// 필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	int speed;

	Car() {
	}

	Car(String model) {
		this.model = model;
	}

	Car(String model, String color) {
		this.model = model;
		this.color = color;
	}

	Car(String model, String color, int maxspeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxspeed;
	}
}
