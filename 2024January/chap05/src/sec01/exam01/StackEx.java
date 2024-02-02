package sec01.exam01;

public class StackEx {

	public static void main(String[] args) {

		String name1 = "신용권";
		String name2 = "신용권";
		System.out.println(name1 == name2);

		String name3 = new String("신용권");
		String name4 = new String("신용권");
		System.out.println(name3 == name4);

	}

}
