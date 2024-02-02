package sec02.exam01;

public class LoopEx {

	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}
		System.out.println("----------");
		int j=0;
		for(;;) {
			if(j>=10) {
				break;
			}
			System.out.println(j);
			j++;
		}
		System.out.println("----------");

		int k=0;
		while(k<10) {
			System.out.println(k);
			k++;
		}
		System.out.println("----------");

		int l=0;
		do {
			System.out.println(l);
			l++;
		} while(l<10);
	}

}
