package sec01;

public class ArrayEx {

	public static void main(String[] args) {

		int[] a = { 1, 3, 10, 2, 8 };

		int sum = 0;
		int count = 0;
		double avg = 0.0;
		int max = -1;
		for (int element : a) {
			sum += element;
			count++;

			if (element > max) {
				max = element;
			}
		}
		System.out.println("1. 합계: " + sum); // 1번
		System.out.println("2. 평균: " + (double) sum / count);// 2번
		System.out.println("3. 최대값: " + max);// 3번
		
		int[] b= {10,3,1,4,2};
		int index=-1;
		for(int i=0;i<b.length;i++) {
			if(b[i]==4) {
				index=i;
			}
		}
		System.out.println("4. index: "+index);

		int x = 10;
		int y = 20;
		int temp;
//		---------------------
		temp = x;
		x = y;
		y = temp;		
		System.out.printf("x,y 교환 결과: x = %d, y = %d\n", x, y); // 4번
		
		
		

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		System.out.print("정렬된 a = {"); // 5번
		for (int val : a) {
			System.out.print(val + ",");
		}
		System.out.printf("};");

	}

}
