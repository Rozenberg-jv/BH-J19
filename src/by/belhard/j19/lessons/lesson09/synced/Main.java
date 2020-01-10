package by.belhard.j19.lessons.lesson09.synced;

public class Main {

    public static void main(String[] args) throws Exception {

        CommonObject obj = new CommonObject();

        Thread myThread01 = new MyThread("myThread01", obj);
        Thread myThread02 = new MyThread("myThread02", obj);
        Thread myThread03 = new MyThread("myThread03", obj);

        myThread01.start();
        myThread02.start();
        myThread03.start();

        myThread01.join();
        myThread02.join();
        myThread03.join();

        System.out.println(obj.getCounter());
    }
}
