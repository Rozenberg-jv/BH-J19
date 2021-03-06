package by.belhard.j19.lessons.lesson04;

import java.util.Objects;

public class Person {

	String name;
	int age;
	Country country;
	Sex sex;

	public Person(String name, int age, Sex sex, String title, int zipCode) {

		this.name = name;
		this.age = age;
		this.country = new Country(title, zipCode);
		this.sex = sex;
	}

	public Person(String name, int age, Country country, Sex sex) {

		this.name = name;
		this.age = age;
		this.country = country;
		this.sex = sex;
	}

	Person(String name) {

		this.name = name;
		this.age = 25;
		this.sex = Sex.MALE;
	}

	/*
	 * Person Person(String name, int age, Country country, Sex sex) {
	 *
	 *   Person person = new Person();
	 *   person.name = name;
	 *   person.age = age;
	 *   ...
	 *
	 *   return person;
	 * }
	 * */

	void walk() {
		//        System.out.println(name + " is walking");
		walk(10);
	}

	void walk(int minutes) {

		System.out.println(name + " is walking for " + minutes + " minutes");
	}

	void eat(String dish) {

		if (dish.equals(""))
			return;

		System.out.println(name + " is eating " + dish + ". Om-nom-nom!");
	}

	int growOld() {

		return ++age;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Person person = (Person) o;
		return age == person.age &&
				Objects.equals(name, person.name) &&
				Objects.equals(country, person.country) &&
				sex == person.sex;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, age, country, sex);
	}

	@Override
	public String toString() {

		return "Person{" +
				"name='" + name + '\'' +
				", age=" + age +
				", country=" + country +
				", sex=" + sex +
				'}';
	}
}
