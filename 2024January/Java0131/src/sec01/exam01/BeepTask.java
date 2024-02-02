package sec01.exam01;

public class BeepTask implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("삡!");
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
			}
		}
	}

}
