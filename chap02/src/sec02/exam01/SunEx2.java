package sec02.exam01;

import java.util.Scanner;

public class SunEx2 {

	public static String input(String txt) {
		Scanner sc = new Scanner(System.in);
		System.out.println(txt);
		return sc.nextLine();
	}

	public static void multi(String a1, String a2) {

		int num1 = Integer.parseInt(a1);
		int num2 = Integer.parseInt(a2);
		int result = num1 * num2;
		System.out.println("곱셈 결과:" + result);
	}

	public static void sum(String b1, String b2) {
		int num1 = Integer.parseInt(b1);
		int num2 = Integer.parseInt(b2);
		int result = num1 + num2;
		System.out.println("덧셈 결과:" + result);
	}

	public static void main(String[] args) {
		String input1 = input("첫번째 수: ");
		String input2 = input("두번째 수: ");

		sum(input1, input2);
		multi(input1, input2);
	}
}
