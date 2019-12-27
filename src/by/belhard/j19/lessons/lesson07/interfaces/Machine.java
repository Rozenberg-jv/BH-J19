package by.belhard.j19.lessons.lesson07.interfaces;

public class Machine implements Workable {

    private String title;

    public Machine(String title) {
        this.title = title;
    }

    public void work() {
        System.out.println("bzhh-bzhh-bzhh");
    }
}
