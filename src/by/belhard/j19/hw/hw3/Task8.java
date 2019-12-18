package by.belhard.j19.hw.hw3;

/*
 * 8.	Дано: «треугольный» массив, то есть двумерный массив, в котором в нулевой ячейке содержится массив с 1 ячейкой, во первой – с двумя, во второй – с тремя и т.д.
 * Целое число startInt.
 * Заполнить массив таким образом, чтобы каждый следующий элемент был в 2 раза больше предыдущего, и вывести его на консоль.
 */

public class Task8 {

	public static void main(String[] args) {

		int value = 1;

		int size = 4;

		int[][] array = new int[size][];

		for (int i = 0; i < size; i++) {
			array[i] = new int[i + 1];

			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = value;
				value *= 2;
			}
		}

		// вывод массива
		for (int[] ints : array) {
			for (int i : ints) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}
