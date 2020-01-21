package by.belhard.j19.lessons.lesson09.threads;

public class ThreadExample {

	public static void main(String[] args) throws InterruptedException {

		SyncObject syncObj = new SyncObject();

		Thread threadInc = new ThreadEx(syncObj, 1);
		Thread threadDec = new ThreadEx(syncObj, -1);

		threadInc.start();
		threadDec.start();

		threadInc.join();
		threadDec.join();

		System.out.println("END");
	}

}
