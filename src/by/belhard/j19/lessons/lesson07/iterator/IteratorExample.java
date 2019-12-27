package by.belhard.j19.lessons.lesson07.iterator;

import java.util.*;


public class IteratorExample {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>() {{
            add("one");
            add("two");
            add("three");
            add("four");
            add("five");
        }};

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String curString = iterator.next();
            System.out.println(curString);
            if (curString.equals("four") || curString.equals("one"))
                iterator.remove();
        }

        System.out.println(list);
    }
}
