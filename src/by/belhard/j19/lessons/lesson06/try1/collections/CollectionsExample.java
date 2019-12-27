package by.belhard.j19.lessons.lesson06.try1.collections;

import by.belhard.j19.lessons.lesson06.try1.Employee;
import by.belhard.j19.lessons.lesson06.try1.Janitor;
import by.belhard.j19.lessons.lesson06.try1.Manager;
import by.belhard.j19.lessons.lesson06.try1.Worker;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class CollectionsExample {

    public static void main(String[] args) {

        Employee employee1 = new Worker("Vasyan", 19, "pick-axe");
        Employee employee2 = new Worker("Igoryan", 49, "hammer");
        Employee employee3 = new Manager("Saveliy", 21, "+37525000");
        Employee employee4 = new Manager("Olga", 32, "+37525001");
        Employee employee5 = new Janitor("Valentin", 61);

        ArrayList<Employee> list = new ArrayList<>();
        // добавляем элементы в список
        list.add(employee1);
        list.add(employee1);
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        list.add(employee4);
        list.add(employee5);

        System.out.println(list.size());

        // удаляем элемент из списка
        list.remove(0);


        // получаем элемент списка по индексу
        Employee employee = list.get(3);

        // пример вывода (не очень)
        System.out.println(list);

        // пример вывода (лучше)
        for (Employee empl : list) {
            System.out.println(empl);
        }

        Set<Employee> set = new HashSet<>(list);
    }
}
