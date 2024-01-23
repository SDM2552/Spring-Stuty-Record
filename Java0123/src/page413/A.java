package page413;

public class A {

	int field1;
	void method1() {
		System.out.println("method1(), "+field1);
	}
	
	
	static int field2;
	static void method2() {}
	
	class B{
		void method() {
			field1=10;
			method1();
			
			field2=10;
			method2();
			
			System.out.println("method(), "+field1);
		}
	}
	
	static class C{
		void methodC() {
			System.out.println("ㅎㅇ");

		}
	}

	public static void main(String[] args) {
		
		A a = new A();
		B b = a.new B();
		C c = new C();
		b.method();
		c.methodC();
		
	}
}

