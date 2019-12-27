package by.belhard.j19.hw.hw7.task2sub;

/*
 * Создать класс Person с полем String name. В другом классе создать поле List<Person> persons. Записать в список 5 экземпляров класса Person.
 * Создать метод, который будет принимать параметр String name и возвращать из списка объект Person с таким именем
 * (либо null, если человека с таким именем нет в списке). После этого вызвать у получившегося объекта метод toString().
 */

import by.belhard.j19.hw.hw7.task1.pets.Dog;

@SuppressWarnings("Duplicates")
public class Main {

	public static void main(String[] args) {

		PersonListHandler personListHandler = new PersonListHandler();

		personListHandler.addPerson(new Person("Vasily"));
		personListHandler.addPerson(new Person("Ivan"));
		personListHandler.addPerson(new Person("Marina"));
		personListHandler.addPerson(new Person("Olga"));
		personListHandler.addPerson(new Person("Ignat"));
		personListHandler.addPerson(new Person("Marina"));

		personListHandler.getListInfo();

		System.out.println("\n" + personListHandler.getPersonByName("Marina"));

		System.out.println();
		System.out.println((long)Integer.MAX_VALUE * 2 + 1);
	}
}