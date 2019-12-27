package by.belhard.j19.lessons.lesson07.stringbuilder;

public class StringBuilderExample {

    public static void main(String[] args) {

        StringBuilder s = new StringBuilder("0");

        for (int i = 0; i < 10; i++)
            s.append(i);

        System.out.println(s.reverse());
    }
}
