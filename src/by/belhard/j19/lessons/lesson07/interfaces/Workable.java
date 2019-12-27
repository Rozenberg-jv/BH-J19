package by.belhard.j19.lessons.lesson07.interfaces;

public interface Workable {

    String VERSION = "QWE";

    void work();

    static void staticMethod() {
        System.out.println("Workable.staticMethod()");
    }

    default void defaultMethod() {
        System.out.println("workable.defaultMethod()");
        privateMethod();
    }

    private void privateMethod() {
        System.out.println("workable.privateMethod()");
    }
}