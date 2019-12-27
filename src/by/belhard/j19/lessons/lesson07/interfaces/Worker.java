package by.belhard.j19.lessons.lesson07.interfaces;

public class Worker implements Workable, Restable {

    private String name;

    public Worker(String name) {
        this.name = name;
    }

    public void work() {
        System.out.println(name + " is working hard");
    }

    @Override
    public void rest() {
        System.out.println(name + " is resting");
    }
}
