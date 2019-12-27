package by.belhard.j19.lessons.lesson07.characterMapTask;

/*
 Создать метод, который принимает строку
 и возвращает Map<Character, Integer> -
 количество каждого символа, который встречается в строке.
 Вывести на консоль.
 */

import java.util.HashMap;
import java.util.Map;

public class CharacterMapTask {

    public static void main(String[] args) {

        String input = "\"Mama myla ramu!\"";

        Map<Character, Integer> result = getCharacterCount(input);

        for (Map.Entry<Character, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    private static Map<Character, Integer> getCharacterCount(String input) {

        Map<Character, Integer> map = new HashMap<>();

        char[] chars = input.toLowerCase().toCharArray();

        for (char c : chars) {
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }

        return map;
    }
}
