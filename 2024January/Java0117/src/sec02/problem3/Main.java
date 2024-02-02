package sec02.problem3;

public class Main {

	public static void main(String[] args) {

		B b1 = new B();
//		B b2 = (B) new A();
		B b3 = new D();
		B b4 = new E();

		A a = new A();
		if (a instanceof B) {
			B b = (B) a;
			System.out.println("캐스팅 가능");
		} else {
			System.out.println("캐스팅 불가능");
		}
	}

}
