package thread;

public class WorkerThread extends Thread{

	@Override
	public void run() {
		System.out.println("Task 시작###############");
		for(int i=0; i<5; i++) {
			System.out.println("Task 진행===============");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Task 끝###############");
	}

}
