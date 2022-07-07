package chapter6.project;

public class Car {
	private double speed;
	private String color;
	private static final double MAX_SPEED = 200;

// 생성자
	public Car() {

	}

	public Car(String color) {
		this.color = color;

	}

//메소드
	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public static double getMaxSpeed() {
		return MAX_SPEED;
	}

	public boolean speedUp(double speed) {
		if (this.speed + speed < 0 || this.speed + speed > MAX_SPEED) {
			return false;
		} else {
			this.speed += speed;
			return true;
		}
	}

	public String toString() {
		return "Car [speed=" + speed + ", color=" + color + "]";
	}

}
