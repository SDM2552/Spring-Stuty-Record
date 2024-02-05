package thread;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//class Clock implements Runnable{
//
//	@Override
//	public void run() {
//		for (;;) {
//			LocalDateTime localDateTime = LocalDateTime.now();
//			String localDateTimeFormat1 = localDateTime
//					.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 MM분 ss초"));
//			System.out.println(localDateTimeFormat1);
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//	}	
//}

public class ExClock  {
	public static void main(String[] args) {
//		System.out.println(LocalDateTime.now());
//		Clock clock = new Clock();
//		Thread clockThread = new Thread(new Clock());
//		clockThread.start();
		mainTask();
	}
	
	public static void mainTask() {
		System.out.println("오늘도");
		long startTime = System.currentTimeMillis();
		String run = "달리고 ";
		String save = "살리고 ";
		try {
			Thread.sleep(200);
			for (int i = 1; i < 5; i++) {
				for (int j = 0; j < i; j++) {
					System.out.print(run);
				}
				System.out.println();
				Thread.sleep(200);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			for (int i = 1; i < 5; i++) {
				for (int j = 0; j < i; j++) {
					System.out.print(save);
				}
				System.out.println();
				Thread.sleep(200);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("돌아라 지구 열 두 바퀴~");
		long endTime = System.currentTimeMillis();
		System.out.println((double) (endTime - startTime) / 1000 + "초");
	}
}
