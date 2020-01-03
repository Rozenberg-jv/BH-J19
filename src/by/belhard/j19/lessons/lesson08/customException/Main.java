package by.belhard.j19.lessons.lesson08.customException;

public class Main {
    public static void main(String[] args) {

        try {
            printPositiveInt(-5);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }

        printPositiveInt(-4);
    }

    private static void printPositiveInt(int value) throws IllegalArgumentException {

        if (value < 0)
            throw new IllegalArgumentException(value);

        System.out.println(value);
    }
}
