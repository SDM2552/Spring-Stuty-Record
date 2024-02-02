package sec01.exam01;

class MyClass2 {
	void method() throws ThrowEx2 {
		
		//보통 조건 추가해서 씀
		
		throw new ThrowEx2("만들어진 예외 상황 발생!");
	}
}

public class ExceptionEx {

	public static void main(String[] args) {

		MyClass2 mc2 = new MyClass2();
		try {
			mc2.method();
		} catch (ThrowEx2 e) {
//			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
