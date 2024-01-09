package project1a;

import java.util.Scanner;

public class Project1a {

	public static void main(String[] args) {

		boolean run = true;
		Scanner sc = new Scanner(System.in); // 필드로 빼는게 낫나?

		ScoreManager sm = new ScoreManager();

		while (run) {
			System.out.println("----------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("----------------------------------------");
			System.out.print("선택> ");

			int select = Integer.parseInt(sc.nextLine());

			switch (select) {

			case 1:
				sm.getStudentNum(sc);
				break;

			case 2:
				sm.inputScore(sc);
				break;

			case 3:
				sm.scoreList();
				break;

			case 4:
				sm.analyzeScore();
				break;

			case 5:
				run = false;
				break;
			}
		}
		sc.close();
		System.out.println("종료");
	}
}
