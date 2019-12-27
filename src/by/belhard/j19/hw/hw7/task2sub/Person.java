package by.belhard.j19.hw.hw7.task2sub;

import java.util.Objects;

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
	public boolean equals(Object o) {

		if (this == o)
			return true;
		if (!(o instanceof Person))
			return false;
		Person person = (Person) o;
		return name.equals(person.name);
	}

	@Override
	public int hashCode() {

		return Objects.hash(name);
	}

	@Override
	public String toString() {

		return "Person{" +
				"name='" + name + '\'' +
				", number=" + number +
				'}';
	}
}
