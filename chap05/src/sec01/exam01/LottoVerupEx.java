package sec01.exam01;

import java.util.Arrays;
import java.util.Random;

public class LottoVerupEx {

	public static void main(String[] args) {

		int[] lotto = new int[6];
		Random rand = new Random();

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = rand.nextInt(45) + 1;
			if (i > 0 && lotto[i] == lotto[i - 1]) {
				lotto[i] = rand.nextInt(45) + 1;
				Arrays.sort(lotto);
				i--;
			}
		}


		for (int val : lotto) {
			System.out.println(val);

		}

	}
}
