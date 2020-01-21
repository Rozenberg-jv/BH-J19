package by.belhard.j19.lessons.lesson09.threads;

public class SyncObject {

	private int counter = 0;

	public synchronized void incCounter(int value) {

		try {
			while (counter > 5) {
				wait();
			}
		} catch (InterruptedException e) {
			System.err.println(e.getMessage());
		}

		System.out.println("update " + counter + " to " + (counter + value));

		counter += value;

		notify();
	}

	public synchronized void decCounter(int value) {

		try {
			while (counter < 0) {
				wait();
			}
		} catch (InterruptedException e) {
			System.err.println(e.getMessage());
		}

		System.out.println("update " + counter + " to " + (counter - value));

		counter -= value;

		notify();
	}

}
