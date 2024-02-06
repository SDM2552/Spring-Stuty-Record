package lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class LottoGenerator {
	public static void main(String[] args) {

		Set<Integer> lottoNumbers = new HashSet<>();
		
		Random random = new Random();
		
		while(lottoNumbers.size()<6) {
			int num = random.nextInt(45)+1;
			lottoNumbers.add(num);
		}
		
		System.out.println("로또 번호: ");
		List<Integer> sortedNumber = new ArrayList<>(lottoNumbers);
		Collections.sort(sortedNumber);
		for(int num: sortedNumber) {
			System.out.print(num+" ");
		}
		
	}
}
