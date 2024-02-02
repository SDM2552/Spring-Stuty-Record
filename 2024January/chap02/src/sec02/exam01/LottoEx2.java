package sec02.exam01;

import java.util.Arrays;
import java.util.Random;

public class LottoEx2 {
	
	private int[] numbers;
	
	public LottoEx2() {
		this.numbers= generateLottoNumbers();
		sortNumbers();
	}
	
	private int[] generateLottoNumbers() {
		Random rd=new Random();
		int[] generatedNumbers=new int[6];
		
		for(int i=0;i<6;i++) {
			generatedNumbers[i]=(int)(rd.nextInt(45)+1);
			
			for(int j=0;j<i;j++) {
				if(generatedNumbers[i]==generatedNumbers[j]) {
					i--;
					break;
				}
			}
		}
		return generatedNumbers;
	}
	
	private void sortNumbers() {
		Arrays.sort(numbers);
	}
	
	public void printResult() {
		System.out.print("이번주 추천 로또 번호는 ");
		for(int number:numbers) {
			System.out.print(number+" ");
		}
		System.out.println("입니다.");
	}

	public static void main(String[] args) {
		LottoEx2 lottoEx=new LottoEx2();
		lottoEx.printResult();
	}

}
