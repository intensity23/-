package chapter6.project;

public class NewCar {
	
		private double speed;
		private String color;
		private static final double MAX_SPEED = 200/1.6;

	// 생성자
		public NewCar() {

		}

		public NewCar(String color) {
			this.color = color;

		}

	//메소드
		public double getSpeed() {
			return mileToKillo(speed);
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
			return mileToKillo(MAX_SPEED);
		}

		public boolean speedUp(double speed) {
			speed = killoToMile(speed);
			if (this.speed + speed < 0 || this.speed + speed > MAX_SPEED) {
				return false;
			} else {
				this.speed += speed;
				return true;
			}
		}
		private static double killoToMile(double distance) {
			return distance /1.6;
		}
		private static double mileToKillo(double distance) {
			return distance*1.6;
		}
		

		public String toString() {
			return "Car [speed=" + speed + ", color=" + color + "]";
		}

	}
