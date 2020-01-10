package by.belhard.j19.lessons.lesson09.synced;

public class CommonObject {

    private int counter = 0;

    public int getCounter() {

        return counter;
    }

    public synchronized void inc() {

        counter++;
    }
}
