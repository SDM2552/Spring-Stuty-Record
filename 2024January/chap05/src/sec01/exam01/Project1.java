package sec01.exam01;

import java.util.Scanner;

public class Project1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;

		while (run) {
			System.out.println("----------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("----------------------------------------");
			System.out.print("선택> ");
			int menuNum = Integer.parseInt(scan.nextLine());
			switch (menuNum) {
			case 1:
				System.out.println("학생수: ");
				studentNum = Integer.parseInt(scan.nextLine());
				scores = new int[studentNum];
				break;

			case 2:
				for (int i = 0; i < scores.length; i++) {
					System.out.print("점수: ");
					scores[i] = Integer.parseInt(scan.nextLine());
				}
				break;

			case 3:
				for (int i = 0; i < scores.length; i++) {
					System.out.println("점수" + (i + 1) + ": " + scores[i]);
				}
				break;

			case 4:
				int max = 0;
				int sum = 0;
				double avg = 0;
				for (int num : scores) {
					if (num > max) {
						max = num;
					}
					sum += num;
				}
				avg = sum / studentNum;
				System.out.println("최고 점수: "+max);
				System.out.println("평균 점수: "+avg);

				break;

			case 5:
				run = false;
				break;
			}
		}
		scan.close();
		System.out.println("프로그램 종료");
	}
}
