package by.belhard.j19.hw.hw3;

import java.util.Arrays;

/*
 * 6.	Создать массив целых чисел, записать в него 10 значений. Посчитать и вывести сумму всех значений и среднее значение.
 * доп1. Посчитать и вывести медиану.
 */
public class Task6 {

	public static void main(String[] args) {

		int[] array = {2, 5, 11, 1, 17, 6, 3, 1, 20, 2};

		int sum = 0;
		double average, mediane;

		for (int i : array) {
			sum += i;
		}

		average = (double) sum / array.length;

		System.out.println("сумма " + sum);
		System.out.println("среднее " + average);

		//
		Arrays.sort(array); // сортировка массива, чтобы найти медиану. Можно реализовать свой алгоритм сортировки.
		System.out.println(Arrays.toString(array)); // выводим значения отсортированного массива для наглядности

		mediane = array.length % 2 == 0 ? (array[array.length / 2] + array[array.length / 2 - 1]) / 2.0 : array[array.length / 2];

		System.out.println("медиана " + mediane);
	}
}
