package by.belhard.j19.lessons.lesson08.customException;

public class IllegalArgumentException extends RuntimeException {

    public IllegalArgumentException(int value) {
        super("Illegal value: " + value);
    }
}
