package sec01.exam01;

class MathOperation{
	double sum;
	double avg;
	
	public MathOperation(int[] array) {
		calculator(array);
	}
	private void calculator(int[] array) {
		for(int score : array) {
			sum += score;
		}
		avg=(double)sum/array.length;

	}
}

public class Exam5 {

	public static void main(String[] args) {
		int[] array = new int[] { 80, 78, 97 }; // 총점, 평균 출력

		MathOperation mathOperation=new MathOperation(array);

		System.out.println("총점: " + mathOperation.sum);
		System.out.println("평균: " + mathOperation.avg);
	}
}
