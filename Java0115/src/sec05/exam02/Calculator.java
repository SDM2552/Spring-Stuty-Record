package sec05.exam02;

public class Calculator {
	
	static int x;
	static int p1() {
		return x+100;
	}
	static int m1() {
		return x-100;
	}
	static void m2() {
		System.out.println(x);
	}
	public static void main(String[] args) {

		m2();
	}

}
