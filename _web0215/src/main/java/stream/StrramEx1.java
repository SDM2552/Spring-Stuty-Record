package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StrramEx1 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		list
		.stream()
		.map(i->"요소는 "+i+" 입니다.")
		.limit(3)
		.forEach(System.out::println);
		
	}
}
