package sec01.exam01;

public class ArrayEx {

	public static void main(String[] args) {
		int[] scores = new int[5]; // 힙 영역 생성 개수
		for(int i=0;i<5;i++) {
			scores[i]=i;
		System.out.println(scores[i]);
		}
		
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);

		System.out.println("--------");
		
		String[] names=new String[5];
		String[] names1= {"하나","둘","셋셋셋","123456"};
		
		for(int i=0;i<names1.length;i++) {
			System.out.println(names1[i]);
			System.out.println(names1[i].length());
		}
	}

}
