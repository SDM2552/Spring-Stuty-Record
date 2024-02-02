package com.proj;

public class ContinueEx {

	public static void main(String[] args) {
		AAA: for (int i = 1; i < 4; i++) {
			for (int j = 0; j < 6; j++) {
				if (i == 3 && j == 3) {
					break AAA;
				}
				System.out.printf("(%d, %d)\t", i, j);
			}
			System.out.println("");
		}
	}
}
