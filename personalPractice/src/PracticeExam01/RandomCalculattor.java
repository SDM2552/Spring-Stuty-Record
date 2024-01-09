package PracticeExam01;

import java.util.Random;
import java.util.Scanner;

class Calculator {

	private Random random;

	public Calculator() {
		this.random = new Random();
	}

	public int calculatorRandom(int a, int b) {
	
		int result;
		int operation = random.nextInt(4);

		switch (operation) {
		case 0:
			result = a + b;
			System.out.println("덧셈");
			break;
		case 1:
			result = a - b;
			System.out.println("뺼셈");
			break;
		case 2:
			result = a * b;
			System.out.println("곱셈");
			break;
		case 3:
			result = (b != 0) ? a / b : 0;
			System.out.println("나눗셈");
			break;
		default:
			result = 0;
		}
		return result;
	}

}

public class RandomCalculattor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Calculator calculator = new Calculator();

		System.out.print("a값 입력: ");
		int operand1 = sc.nextInt();
		System.out.print("b값 입력: ");
		int operand2 = sc.nextInt();

		int result = calculator.calculatorRandom(operand1, operand2);
		System.out.printf("%d,%d 결과: %s ", operand1, operand2, result);

		sc.close();
	}
}
