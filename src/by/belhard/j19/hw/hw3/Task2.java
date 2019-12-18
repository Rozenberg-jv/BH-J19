package by.belhard.j19.hw.hw3;

/*
 * 2.	Даны зарплаты трех людей. Найти разницу между максимальной и минимальной зарплатой.
 */

public class Task2 {

	public static void main(String[] args) {

		int salary1 = 100, salary2 = 300, salary3 = 200;

		int min, max;

		min = salary1;
		if (salary2 < min)
			min = salary2;
		if (salary3 < min)
			min = salary3;

		max = salary1;
		if (salary2 > max)
			max = salary2;
		if (salary3 > max)
			max = salary3;

		System.out.println("Difference between max and min salary is : " + (max - min));

	}
}
