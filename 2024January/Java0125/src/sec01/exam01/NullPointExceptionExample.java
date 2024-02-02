package sec01.exam01;

class MyClass {
	void method() {}
}

public class NullPointExceptionExample {

	public static void main(String[] args) {

		MyClass mc = null;
		mc.method();
//		String data = null;
//		System.out.println(data.toString());
	}

}
