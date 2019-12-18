package by.belhard.j19.hw.hw3;

/*
 * 7. Вывести на консоль таблицу умножения
 */

public class Task7 {

	public static void main(String[] args) {

		// вариант с print()
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				if (i == 1 && i == j) { // это условие нужно, чтобы не выводить единицу в углу
					System.out.print("\t");
					continue;
				}
				System.out.print(i * j + "\t");
			}
			System.out.println();
		}

		System.out.println();
		// вариант с printf()
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				if (i == 1 && i == j) { // это условие нужно, чтобы не выводить единицу в углу
					System.out.printf("%4s", "");
					continue;
				}
				System.out.printf("%-4d", i * j);
			}
			System.out.println();
		}
	}
}
