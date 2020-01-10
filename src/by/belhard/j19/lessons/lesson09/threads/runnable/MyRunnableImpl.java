package by.belhard.j19.lessons.lesson09.threads.runnable;

public class MyRunnableImpl implements Runnable {

    private final String name;

    public MyRunnableImpl(String name) {
        this.name = name;
    }

    @Override
    public void run() {

        while (true) {

            try {
                Thread.sleep(1500);
                System.out.printf("%s\n", name);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

//        System.out.println("End of " + name);
    }
}
