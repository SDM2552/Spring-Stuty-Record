package sec01.exam02;

public interface InterTest {

	void test();

	default void test1() {
		System.out.println("test1();");
	}
	default void test3() {
		test4();
	}
	private void test4() {
		System.out.println("test4()");
	}
	static void test5() {
		System.out.println("test5()");
	}
}
