package sec01.exam01;

public class NumberFormatExceptionExample {

	public static void main(String[] args) {

		try {
			int x = Integer.parseInt("미안");
			System.out.println(x);
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}
	}

}
