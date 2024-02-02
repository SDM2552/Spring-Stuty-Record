package sec02.exam01;

import java.util.Scanner;

public class SumEx3 {
	
	static int num1;
	static int num2;
	
	public static void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수:");
		int Num1 = Integer.parseInt(sc.nextLine());
		System.out.print("두번째 수:");
		int Num2 = Integer.parseInt(sc.nextLine());
	}
	
	public static void sum() {
		int result = num1 + num2;
		System.out.println("덧셈 결과:" + result);
		
	}

	public static void multi() {
		int result = num1 * num2;
		System.out.println("곱셈 결과:" + result);
	}


	public static void main(String[] args) {
		
		input();
		sum();
		multi();
	}
}
