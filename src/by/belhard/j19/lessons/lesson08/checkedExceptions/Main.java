package by.belhard.j19.lessons.lesson08.checkedExceptions;

public class Main {

    public static void main(String[] args) {

        Entity entity = new Entity();

        try {
            System.out.println(entity.getNewinstance());
        } catch (Exception e) {
            System.err.println("Something went wrong");
        } finally {
            System.out.println("END OF try-catch-finally");
        }

        System.out.println(new FinallyExample().getString());

        System.out.println("END OF PROGRAM");
    }
}
