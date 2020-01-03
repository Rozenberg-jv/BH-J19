package by.belhard.j19.hw.hw8.task3;

import by.belhard.j19.hw.hw8.task3.figures.Circle;
import by.belhard.j19.hw.hw8.task3.figures.Figure;
import by.belhard.j19.hw.hw8.task3.figures.Rectangle;
import by.belhard.j19.hw.hw8.task3.figures.Square;

public class Main {

	public static void main(String[] args) {

		Figure circle = new Circle(10);

		Figure rectangle = new Rectangle(5, 10);

		Figure square = new Square(10);

		System.out.println("Squares:");
		System.out.println("circle: " + CalculationUtils.getSquare(circle));
		System.out.println("rectangle: " + CalculationUtils.getSquare(rectangle));
		System.out.println("square: " + CalculationUtils.getSquare(square));
		System.out.println("Perimeters:");
		System.out.println("circle: " + CalculationUtils.getPerimeter(circle));
		System.out.println("rectangle: " + CalculationUtils.getPerimeter(rectangle));
		System.out.println("square: " + CalculationUtils.getPerimeter(square));
	}
}
