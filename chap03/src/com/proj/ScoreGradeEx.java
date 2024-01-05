package com.proj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScoreGradeEx {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("점수를 입력하세요.");
		int input = Integer.parseInt(br.readLine());

		switch (input / 10) { //If 문이 좋지만 switch 테스트

		case 10:
			System.out.println("?");
			break;

		case 9:
			System.out.println("등급은 A 입니다.");
			break;

		case 8:
			System.out.println("등급은 B 입니다.");
			break;

		case 7:
			System.out.println("등급은 C 입니다.");
			break;

		default:
			System.out.println("등급은 D 입니다.");
			break;
		}
	}

}
