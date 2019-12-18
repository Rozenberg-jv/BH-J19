package by.belhard.j19.hw.hw3;

/*
 * 3.	Даны 2 числа, a – целое, n – целое положительное. Используя цикл, найти результат возведения a в степень n.
 */

public class Task3 {

	public static void main(String[] args) {

		int x = 2;
		int n = 5;

		//		int pow = (int) Math.pow(x, n); // вариант с Math

		int pow = x;

		for (int i = 1; i < n; i++)
			pow *= x;

		System.out.println("Результат возведения " + x + " в степень " + n + " равен " + pow);
//		System.out.printf("Результат возведения %d в степень %d равен %d\n", x, n, pow); // вариант с printf()
	}
}
