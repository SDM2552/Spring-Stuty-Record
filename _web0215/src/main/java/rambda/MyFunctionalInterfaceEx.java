package rambda;

public class MyFunctionalInterfaceEx {
	public static void main(String[] args) {
		MyFunctionalInterface f1;
//		f1= (x,y) -> {
//			return x+y;
//		};
		f1= (x,y) -> sum(x,y);
		System.out.println(f1.method(10, 20));
	}
	public static int sum(int x, int y) {
		return x+y;
	}
}
