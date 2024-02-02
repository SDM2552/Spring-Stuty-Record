package sec01.exam01;

import java.util.Scanner;


public class Exam06a {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);
		
		ScoreManager scoreManager = new ScoreManager();

		while (run) {
			System.out.println("----------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("----------------------------------------");
			System.out.print("선택> ");

			int selectNo = Integer.parseInt(sc.nextLine());

			switch (selectNo) {

			case 1:

				studentNum = scoreManager.getStudentNum(sc);
				scores = new int[studentNum];
				break;

			case 2:

				scoreManager.inputScores(sc, scores);
				break;

			case 3:

				scoreManager.printScores(scores);
				break;

			case 4:

				scoreManager.analyzeScore(scores);
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

class ScoreManager{
	
	 int getStudentNum(Scanner sc) {
		System.out.print("학생수> ");
		return Integer.parseInt(sc.nextLine());
	}

	 void inputScores(Scanner sc, int[] scores) {
		for (int i = 0; i < scores.length; i++) {
			System.out.printf("scores[%d]> ", i);
			scores[i] = Integer.parseInt(sc.nextLine());
		}
	}

	 void printScores(int[] scores) {
		for (int num : scores) {
			System.out.println(num);
		}
	}

	 void analyzeScore(int[] scores) {
		int sum = 0;
		int max = 0;
		double avg;
		for (int score : scores) {
			if (score > max) {
				max = score;
			}
			sum += score;
		}
		avg = (double) sum / scores.length;

		System.out.printf("최고 점수: %d\n", max);
		System.out.printf("평균 점수: %f\n", avg);

	}
}