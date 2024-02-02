package sec02.exam01;

public class OperatorTx {

	public static void main(String[] args) {
		byte b=100+10;
		byte result = (byte)(-b);
		
		int x=1;
		int y=1;
		
		int result1= ++x + 10;
		int result2= y++ + 10;
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(x+" "+y);
		
		char c1='a'+1;
		System.out.println((char)c1);
		System.out.println(0.1<(double)0.1f);
	}

}
