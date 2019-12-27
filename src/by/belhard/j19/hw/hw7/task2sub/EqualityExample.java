package by.belhard.j19.hw.hw7.task2sub;

public class EqualityExample {

    public static void main(String[] args) {

        Person person1 = new Person("Vasily");
        Person person2 = new Person("Ivan");
        Person person3 = new Person("Vasily");

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);

        System.out.println("person1.equals(person2) "
                + person1.equals(person2));
        System.out.println("person1.equals(person3) "
                + person1.equals(person3));
    }
}
