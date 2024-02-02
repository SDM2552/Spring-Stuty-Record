package sec01.exam02;

public class MyClass implements InterTest{

	@Override
	public void test() {
	}
	@Override
	public void test1() {
		System.out.println("새로운 test1()");
	}
	
	public static void main(String[] args) {
		InterTest it = new MyClass();
		it.test1();
		InterTest.test5();
	}

}
