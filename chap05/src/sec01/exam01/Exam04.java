package sec01.exam01;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		int max = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("입력할 갯수: ");
		int count = sc.nextInt();
		int[] intNum = new int[count];

		for (int i = 0; i < intNum.length; i++) {
			System.out.print("정수입력: ");
			intNum[i] = sc.nextInt();// 입력

		}
		for (int num : intNum) { // 최대값 구해서 출력

			if (max < num) {
				max = num;
			}
		}

//		int index = 0;
//		int[] array = { 1, 5, 3, 8, 2 };
//		int i = 0;
//
//		for (int num : array) {
//			if (max < num) {
//				max = num;
//				index = i;
//			}
//			i++;
//		}
//		System.out.println("index: " + index);
		System.out.println("max: " + max);

	}

}
