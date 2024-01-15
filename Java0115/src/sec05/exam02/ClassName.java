package sec05.exam02;

public class ClassName {
	int field1;
	void method1() {}
	static int field2;
	static void method2() {}
	
	static void method3() {
		ClassName cn = new ClassName();
		cn.field1=10; // <객체 생성 후 사용 가능
		field2=10;
	}
	void method4() {
		field1=10;
		field2=10;
	}
}
