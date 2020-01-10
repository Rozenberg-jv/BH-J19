package by.belhard.j19.lessons.lesson09.threads.thread;

import by.belhard.j19.lessons.lesson09.threads.runnable.MyRunnableImpl;

public class Main {

    public static void main(String[] args) throws Exception {

        Thread myThread01 = new MyThread("myThread01");
        Thread myThread02 = new MyThread("myThread02");
        Thread myThread03 = new Thread(new MyRunnableImpl("myRunnableImpl"));

        myThread03.setDaemon(true);

//        myThread01.run();
        myThread01.start();
        myThread02.start();
        myThread03.start();

//        throw new RuntimeException();
        myThread01.join();
        myThread02.join();

        System.out.println("End of MAIN Thread");
    }
}
