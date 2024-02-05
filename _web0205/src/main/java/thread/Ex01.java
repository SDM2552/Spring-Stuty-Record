package thread;

public class Ex01 {
	public static void main(String[] args) {
		System.out.println("오늘도");
		long startTime = System.currentTimeMillis();
		String str="달리고 ";
		String str2="살리고 ";
		try {
			Thread.sleep(200);
			for(int i=1;i<5;i++) {
				for(int j=0;j<i;j++) {
				System.out.print(str);}
				System.out.println();
				Thread.sleep(200);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			for(int i=1;i<5;i++) {
				for(int j=0;j<i;j++) {
				System.out.print(str2);}
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
