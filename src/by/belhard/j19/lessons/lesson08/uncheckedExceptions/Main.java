package by.belhard.j19.lessons.lesson08.uncheckedExceptions;

public class Main {

    public static void main(String[] args) {

        System.out.println(new GetNullExample(null).getLowercase());
        System.out.println(new GetNullExample("NUEQaa").getLowercase());

    }
}
