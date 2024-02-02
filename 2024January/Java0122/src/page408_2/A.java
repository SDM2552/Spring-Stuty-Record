package page408_2;

public class A {

	static class C{
		C(){}
		int field1;
		static int field2;
		void method1() {}
		static void method2() {}
	}
	void methodA() {
		C c =new C();
		c.field1=10;
		C.field2=20;
		c.method1();
		C.method2();
	}
}
