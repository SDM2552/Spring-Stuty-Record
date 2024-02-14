package ramda;

public class MyFuncEx {
	public static void main(String[] args) {
		
		MyFunc mf, mf2, mf3;
		
		mf = new MyFunc() {
			@Override
			public void method() {
				System.out.println("method1");
			}
		};
		mf.method();
		
		mf2=()-> {
			System.out.println("method2");};
		mf2.method();
		
		mf3 = () -> System.out.println("method3");
		mf3.method();
	}
}
