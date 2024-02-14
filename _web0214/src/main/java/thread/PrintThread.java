package thread;

public class PrintThread extends Thread{
	private boolean stop;
	String running = "실행 중";
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}


	@Override
	public void run() {
		while(!stop) {		
			
			System.out.println(running);
			running+="~";
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}

	
}
