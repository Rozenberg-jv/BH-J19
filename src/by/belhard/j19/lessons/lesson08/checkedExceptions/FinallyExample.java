package by.belhard.j19.lessons.lesson08.checkedExceptions;

public class FinallyExample {

    public String getString() {

        try {
            throw new Exception();
        } catch (Exception e) {
            System.exit(0);
            return "exception";
        } finally {
            return "finally";
        }

    }
}
