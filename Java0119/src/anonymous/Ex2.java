package anonymous;

interface Inter{
	void disp();
}

public class Ex2 {

	public static void main(String[] args) {
		Inter it = new Inter() {
			
			int y=100;
			public void disp2() {
				System.out.println("disp2");				
			}
			public void disp3() {
				System.out.println("disp3");
			}
			@Override
			public void disp() {
				System.out.println(y);
				disp3();
			}
		};
		it.disp();
//		it.disp2(); <- 이렇게는 못부름
	}
}
