package by.belhard.j19.hw.hw7.task2;

public class Person {

	private static int counter = 0;

	private String name;
	private int number;

	public Person(String name) {

		this.name = name;
		number = counter++;
	}

	public String getName() {

		return name;
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", number=" + number +
				'}';
	}
}
