package by.belhard.j19.lessons.lesson04;

public class Main {

    public static void main(String[] args) {

        Country brazil = new Country();
        brazil.title = "Brazil";
        brazil.zipCode = 123456;

        Person alfredo = new Person("Alfredo", 21, brazil, Sex.MALE);

        /*alfredo.name = "Alfredo";
        alfredo.age = 21;
        alfredo.country = brazil;
        alfredo.sex = Sex.MALE;*/

        Person tereza = new Person("Tereza", 20, brazil, Sex.FEMALE);
        /*tereza.name = "Tereza";
        tereza.age = 20;
        tereza.country = brazil;
        tereza.sex = Sex.FEMALE;*/

//        System.out.println(tereza.age);
//        System.out.println(alfredo.country.zipCode);
//        System.out.println(tereza.country.zipCode);

        Person personTest = new Person("Lololo");

        System.out.println(personTest.country.title);

        alfredo.walk();
        alfredo.eat("fish");

        int newAge = alfredo.growOld();
        System.out.println(newAge);
        System.out.println(alfredo.growOld());

        System.out.println(alfredo.toString());
        System.out.println(tereza);


    }
}
