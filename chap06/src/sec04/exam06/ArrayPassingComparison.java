package sec04.exam06;

public class ArrayPassingComparison {
	
	int s = 0;
	
	public void sum(int[] x) {
		
		for (int n = 0; n < x.length; n++) {
			s += x[n];
		}
	}

	public static void main(String[] args) {

		ArrayPassingComparison arr=new ArrayPassingComparison();
		
		int[] a = { 1, 2, 3, 4, 5 };
		arr.sum(a);
		System.out.println(arr.s);

	}

}
