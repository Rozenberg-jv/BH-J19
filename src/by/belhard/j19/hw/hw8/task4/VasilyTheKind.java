package by.belhard.j19.hw.hw8.task4;

import java.util.*;

public class VasilyTheKind {

    private final Map<String, List<String>> requests = new HashMap<>();

    public void asked(String name, String... items) {

        if (!requests.containsKey(name))
            requests.put(name, new ArrayList<>() {{
                this.addAll(Arrays.asList(items));
            }});
        else
            requests.get(name).addAll(Arrays.asList(items));
    }

    public void printShoppingList() {

        Map<String, Integer> shoppingList = new HashMap<>();

        for (List<String> list : requests.values())
            for (String item : list)
                if (!shoppingList.containsKey(item))
                    shoppingList.put(item, 1);
                else
                    shoppingList.put(item, shoppingList.get(item) + 1);

        shoppingList.forEach((k, v) -> System.out.printf("%s : %d\n", k, v));
    }

}
