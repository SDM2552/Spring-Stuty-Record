package sort;

public class BubbleSort {

	public static void bubbleSort(int[] a) {
		bubbleSort(a, a.length);
	}
	
	private static void bubbleSort(int[] a, int size) {
		for(int i=1; i<size; i++) {
			for(int j=0;j<size-i;j++) {
				if(a[j]>a[j+1]) {
					swap(a,j,j+1);
				}
			}
		}
	
	}
	
	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i]=a[j];
		a[j]=temp;
	}

	
	public static void main(String[] args) {
		int arr[]= {10,4,30,23,1,7,9};
		
		bubbleSort(arr,arr.length);
		
		for(int num:arr) {
			System.out.print(num+" ");
		}
	}
}
