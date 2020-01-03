package by.belhard.j19.hw.hw8.task4;

public class Main {

	public static void main(String[] args) {

		VasilyTheKind vasya = new VasilyTheKind();

		vasya.asked("Olga", "bread", "bread", "butter", "milk");
		vasya.asked("Ivan", "beer", "beer", "beer", "pelmeni");
		vasya.asked("Oleg", "bread", "pelmeni", "beer");
		vasya.asked("Misha", "milk", "bread");

		vasya.asked("Olga", "beer");

		vasya.printShoppingList();
	}

}
