package sec01.verify.exam02;

public class MusicRunnable implements Runnable{

	@Override
	public void run() {
		try {//--------------------------0.01초 늦게 시작하게
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for(int i=0; i<3; i++) {
			System.out.println("음악을 재생합니다.");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("음악 재생이 끝났습니다...");
	}

}
