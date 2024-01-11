package sec01;

import java.util.Scanner;

public class ArrayInArrayEx {

	public static void main(String[] args) {

		int sum = 0;
		double avg;

		Scanner sc = new Scanner(System.in);

		System.out.println("행 입력:");
		int a = sc.nextInt();
		System.out.println("렬 입력:");
		int b = sc.nextInt();

		int[][] scores = new int[a][b];

		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				System.out.printf("((%d, %d)번 입력: ", i, j);
				scores[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				System.out.printf("((%d, %d)번 점수: ", i, j);
				System.out.println(scores[i][j]);
			}
		}
		// 평균을 계산해서 출력해보세요.
//		for (int i = 0; i < scores.length; i++) {
//			for (int j = 0; j < scores[i].length; j++) {
//				sum += scores[i][j];
//			}
//		}
		for(int[] arr:scores) {
			for(int val:arr) {
				sum+=val;
			}
		}
		avg = (double) sum / (a * b);
		System.out.printf("\n총점: %d \t평균: %g", sum, avg);
	}

}
