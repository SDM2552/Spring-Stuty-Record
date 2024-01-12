package sec02.exam03;

public class Calculator {
	
	private int plus(int x, int y) {
		int result = x + y;
		return result;
	}

	double avg(int x, int y) {
		double sum = this.plus(x, y);
		double result = sum / 2;
		return result;
	}

	void execute() {
		double result = this.avg(7, 10);
		this.println("실행결과: " + result);
	}

	void println(String message) {
		System.out.println(message);
	}
}
