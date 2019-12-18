package by.belhard.j19.hw.hw3;

/*
 * 4. Банк предлагает вклад под процент. Дано: начальная сумма вклада startSum, процент годовых proc, количество лет years, на которые совершается вклад.
 *  Сумма индексируется каждый год (это значит, что после каждого года процент начисляется не на изначальную сумму, а на текущую).
 *  Вывести, сколько денег будет на счету после years лет.
 */

public class Task4 {

	public static void main(String[] args) {

		int startSum = 1000;
		double proc = 0.1; // 10%
		int years = 2;

		double money = startSum;

		for (int i = 0; i < years; i++)
			money += money * proc;

		System.out.println(
				"Вклад на " + startSum +
						" тугриков на " + years +
						" лет под " + proc +
						"% даст в итоге " + money + " тугриков");
		//		System.out.printf("Вклад на %d тугриков на %d лет под %d%% даст в итоге %.2f тугриков", startSum, years, (int) (proc * 100), money); // вариант с printf()

	}

}
