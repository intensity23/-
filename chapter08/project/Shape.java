package chapter8.project;

import java.awt.geom.Area;

public abstract class Shape implements Comparable<Shape> {
	public Shape() {

	}

	public abstract double area();

	public abstract double perimeter();

	@Override
	public int compareTo(Shape o) {
		if (this.area() > o.area()) {
			return 1;

		} else if (this.area() < o.area()) {

			return -1;
		}
		return 0;

	}
}
