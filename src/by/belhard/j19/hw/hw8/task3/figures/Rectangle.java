package by.belhard.j19.hw.hw8.task3.figures;

public class Rectangle implements Figure {

	private double sideA;

	private double sideB;

	public Rectangle(double sideA, double sideB) {

		this.sideA = sideA;
		this.sideB = sideB;
	}

	@Override
	public double getSquare() {

		return sideA * sideB;
	}

	@Override
	public double getPerimeter() {

		return (sideA + sideB) * 2;
	}
}
