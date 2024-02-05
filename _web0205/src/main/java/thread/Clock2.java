package thread;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JFrame;

class Clock2 implements Runnable{
	
	JFrame jf;

	Clock2(JFrame jf) {
		this.jf = jf;
	}
	
	@Override
	public void run() {
		for (;;) {
			LocalDateTime localDateTime = LocalDateTime.now();
			String localDateTimeFormat1 = localDateTime
					.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 MM분 ss초"));
//			System.out.println(localDateTimeFormat1);
			jf.setTitle(localDateTimeFormat1);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}	
}