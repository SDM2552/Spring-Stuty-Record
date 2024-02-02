package sec01;

class MyClass2{
	int x;
}

public class Passing2 {

	
	public static void main(String[] args) {

		MyClass2 mc2 = new MyClass2(); // 객체 생성(기본생성자 실행)
		System.out.println("main: "+mc2);
		method1(mc2);
		System.out.println("main: "+mc2.x);
//		MyClass2 mc3=new MyClass2();
//		System.out.println("다른 객체: "+mc3);
	}
	public static void method1(MyClass2 mc2) {
//		System.out.println(mc2);
		mc2.x=300;
		return;
	}

}
