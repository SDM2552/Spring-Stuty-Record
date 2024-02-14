package thread;

public class PrintThread3 extends Thread {
	String running = "실행 중";

	@Override
	public void run() {
		while(true) {
			System.out.println(running);
			
			if(Thread.interrupted()) {
				break;
			}
		}
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
}
