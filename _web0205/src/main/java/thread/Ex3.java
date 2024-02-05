package thread;

public class Ex3 {
	public static void main(String[] args) {

		Thread th = new Thread(new Runnable() {
			long startTime = System.currentTimeMillis();
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
				long endTime = System.currentTimeMillis();
				System.out.println((double)(endTime-startTime)/1000+"초");
			}
		});
		
		th.start();
		mainTask();
	}
	
	public static void mainTask() {
		System.out.println("오늘도");
		long startTime = System.currentTimeMillis();
		String run="달리고 ";
		String save="살리고 ";
		try {
			Thread.sleep(200);
			for(int i=1;i<5;i++) {
				for(int j=0;j<i;j++) {
				System.out.print(run);}
				System.out.println();
				Thread.sleep(200);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			for(int i=1;i<5;i++) {
				for(int j=0;j<i;j++) {
				System.out.print(save);}
				System.out.println();
				Thread.sleep(200);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("돌아라 지구 열 두 바퀴~");
		long endTime = System.currentTimeMillis();
		System.out.println((double)(endTime-startTime)/1000+"초");
	}
}
