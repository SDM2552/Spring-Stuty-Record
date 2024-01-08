package sec01.exam01;

import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);

		while (run) {
			System.out.println("----------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("----------------------------------------");
			System.out.print("선택> ");

			int selectNo = Integer.parseInt(sc.nextLine());

			if (selectNo == 1) {

				System.out.print("학생수> ");
				studentNum = Integer.parseInt(sc.nextLine());
				scores = new int[studentNum];

			} else if (selectNo == 2) {

				for (int i = 0; i < scores.length; i++) {
					System.out.printf("scores[%d]> ", i);
					scores[i] = Integer.parseInt(sc.nextLine());
				}

			} else if (selectNo == 3) {

				for (int num : scores) {
					System.out.println(num);
				}

			} else if (selectNo == 4) {

				int sum = 0;
				int max = 0;
				double avg;
				for (int i = 0; i < scores.length; i++) {
					if (scores[i] > max) {
						max = scores[i];
					}
					sum += scores[i];
				}
				avg = (double) sum / scores.length;

				System.out.printf("최고 점수: %d\n", max);
				System.out.printf("평균 점수: %f\n", avg);

			} else if (selectNo == 5) {
				run = false;
			}
		}
		sc.close();
		System.out.println("종료");
	}

}
