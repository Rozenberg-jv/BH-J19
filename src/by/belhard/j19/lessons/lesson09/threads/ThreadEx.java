package by.belhard.j19.lessons.lesson09.threads;

public class ThreadEx extends Thread {

	private final SyncObject syncObj;

	private final int delta;

	public ThreadEx(SyncObject syncObj, int delta) {

		this.syncObj = syncObj;
		this.delta = delta;
	}

	@Override
	public void run() {

		while (true) {
			try {
				Thread.sleep(1000);

				if (delta >= 0)
					syncObj.incCounter(delta);
				else
					syncObj.decCounter(-delta);
			} catch (InterruptedException e) {
				System.err.println(e.getMessage());
			}
		}
	}
}
