package chapter6;

public class CarExample2 {
	public static void main(String[] args) {
		Car2 car2 = new Car2();
		car2.keyTurnOn();
		car2.run();
		int speed = car2.getSpeed();
		System.out.println("현재속도: " + speed + "km/h");
	}

}
