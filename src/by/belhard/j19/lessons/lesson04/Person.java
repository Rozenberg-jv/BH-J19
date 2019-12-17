package by.belhard.j19.lessons.lesson04;

public class Person {

    String name;
    int age;
    Country country;
    Sex sex;

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
        return this.age;
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
