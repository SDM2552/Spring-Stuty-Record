package project1a;

import java.util.Scanner;

public class ScoreManager {

	private int studentNum = 0; // private 안해도 되나?
	private int[] scores;
	private int sum = 0;
	private int max = 0;
	private double avg;

	void getStudentNum(Scanner sc) { // 학생수 입력
		System.out.print("학생수> ");
		studentNum = Integer.parseInt(sc.nextLine());
		scores = new int[studentNum];
	}

	void inputScore(Scanner sc) { // 점수입력
		for (int i = 0; i < studentNum; i++) {
			System.out.printf("scores[%d]> ", i);
			scores[i] = Integer.parseInt(sc.nextLine());
		}
	}

	void scoreList() { // 점수목록
		for (int num : scores) {
			System.out.println(num);
		}
	}

	void analyzeScore() { // 점수분석
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] > max) {
				max = scores[i];
			}
			sum += scores[i];
		}
		avg = (double) sum / scores.length;

		System.out.printf("최고 점수: %d\n", max);
		System.out.printf("평균 점수: %f\n", avg);
	}
}
