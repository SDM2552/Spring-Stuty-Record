package sec02.exam01;

import java.util.Arrays;
import java.util.Random;

public class LotteEx {

	public static void main(String[] args) {
		Random random=new Random();
		
		int[] numbers=new int[6];
		for(int i=0;i<6;i++) {
			numbers[i]=(int)(random.nextInt(45)+1);
			
			for(int j=0;j<i;j++) {
				if(numbers[i]==numbers[j]) {
					i--;
					break;
				}
			}
		}
		
		Arrays.sort(numbers); //밑에 과정 의미없네
//		int temp;
//		for(int i=0;i<numbers.length;i++) {
//			for(int j=0;j<i;j++) {
//				if(numbers[i]<numbers[j]) {
//				temp=numbers[i];
//				numbers[i]=numbers[j];
//				numbers[j]=temp;
//				}
//			}
//		}
		
		System.out.print("이번 주 추천 로또 번호는 ");
		for(int number:numbers) {
			System.out.print(number+" ");
		}
		System.out.println("입니다.");
	}

}
