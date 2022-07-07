package chapter6.project;

public class Circle {
	// 필드
	private double radius;
	private double x;
	private double y;

	public Circle() {

	}

	double getArea() {
		this.radius * this.radius * Math.PI;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
		if (radius < 0) {
			this.radius = 0;
		}
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

}
