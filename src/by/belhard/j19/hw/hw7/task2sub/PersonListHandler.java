package by.belhard.j19.hw.hw7.task2sub;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class PersonListHandler {

//    	private final List<Person> personList = new ArrayList<>();
    private final Collection<Person> personList = new HashSet<>();

    public void addPerson(Person person) {

        personList.add(person);
    }

    public Person getPersonByName(String name) {

        for (Person person : personList)
            if (person.getName().equals(name))
                return person;

        return null;
    }

    public void getListInfo() {

        personList.forEach(System.out::println);
    }
}
