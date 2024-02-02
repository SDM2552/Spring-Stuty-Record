package sec02.exam01;

import java.util.Random;
import java.util.Scanner;

public class CrossproductEx {

	public static void quiz() {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);

		int a = rd.nextInt(10);
		int b = rd.nextInt(10);
		int multi = a * b;
		for (;;) {
			System.out.printf("%d x %d = \n정답은?>", a, b);

			int answer = Integer.parseInt(sc.nextLine());
			if (answer == multi) {
				System.out.println("정답입니다!");
				break;
			} else {
				System.out.println("틀렸습니다!");
			}
		}
		sc.close();
	}

	public static void main(String[] args) {

		quiz();
	}
}
