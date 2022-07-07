package chapter7.project;

public class Triangle extends Shape{
	private double side;

	public Triangle(double side) {
		this.side = side;

	}
	@Override
public double area() {
		return Math.sqrt(3)/4*side*side;
	}
	@Override
public double perimeter() {
		return side * 3;
	}

	public String toString() {
		return "도형의 종류: 삼각형, 둘레:" + perimeter() + "cm, 넓이:"+area()+"cm²";
	}
}
