package sec01.exam01;

public class ArrayIndexOutOfBoundExceptionExample2 {

	public static void main(String[] args) {

		try {
			String str=args[0];
			String str1=args[12];
			
			System.out.println(str);
			System.out.println(str1);
			
		} catch(ArrayIndexOutOfBoundsException e){
			System.out.println("예외 발생!");
//			e.printStackTrace();
			System.out.println(e.getMessage());
			
		}

	}

}
