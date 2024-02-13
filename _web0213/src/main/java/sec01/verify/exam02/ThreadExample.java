package sec01.verify.exam02;

public class ThreadExample {
	public static void main(String[] args) {
		Thread thread1 = new MovieThread();
		Thread thread2 = new Thread(new MusicRunnable());
		Thread mth = Thread.currentThread();
		thread2.setName("Music");
		
		System.out.println(mth.getName());
		System.out.println(thread1.getName());
		System.out.println(thread2.getName());
		thread1.start();
		thread2.start();
	}
}
