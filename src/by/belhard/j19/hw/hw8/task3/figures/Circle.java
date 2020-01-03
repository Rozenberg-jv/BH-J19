package by.belhard.j19.hw.hw8.task3.figures;

public class Circle implements Figure {

	private double radius;

	public Circle(double radius) {

		this.radius = radius;
	}

	@Override
	public double getSquare() {

		return Math.PI * radius * radius;
	}

	@Override
	public double getPerimeter() {

		return 2 * Math.PI * radius;
	}
}
