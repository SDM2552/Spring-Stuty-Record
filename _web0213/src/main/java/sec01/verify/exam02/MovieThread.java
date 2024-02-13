package sec01.verify.exam02;

public class MovieThread extends Thread{

	public MovieThread() {
		this.setName("Movie");
	}
	@Override
	public void run() {
		
		for(int i=0; i<3; i++) {
			System.out.print(this.getName()+"를 재생합니다. ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.print("동영상 재생이 끝났습니다... ");
	}
}
