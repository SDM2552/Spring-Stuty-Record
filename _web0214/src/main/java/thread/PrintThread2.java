package thread;

public class PrintThread2 extends Thread{
	String running = "실행 중";

	@Override
	public void run() {
			try {
				while(true) {
					System.out.println(running);
					running+="~";
				Thread.sleep(10);
			}
		} catch (InterruptedException e) {
			System.out.println("자원 정리");
			System.out.println("실행 종료");
		}
	}

	
}
