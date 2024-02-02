package sec01.exam01;

class MyClass3 {
	void method() {
		throw new MyException2("어쩌고 실행 예외 발생?!");
	}
}

public class ExceptionEx2 {

	public static void main(String[] args) {

		MyClass3 mc = new MyClass3();
		try {
		mc.method();
		}catch(MyException2 e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
