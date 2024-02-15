package rambda;

public class MyFuncEx {
	public static void main(String[] args) {
		MyFunc mf = ()->{System.out.println("hello lambda");};
		mf.aaa();
		
		MyFunc mf1 = new MyFunc() {
			
			@Override
			public void aaa() {
				System.out.println("람람");
			}
			
		};
		mf1.aaa();
	}
}
