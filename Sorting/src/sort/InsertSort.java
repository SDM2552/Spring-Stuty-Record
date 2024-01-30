package sort;

public class InsertSort {

	public static void main(String[] args) {

		int arr[] = { 6, 5, 7, 2, 8, 9, 3, 10 };

		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j -= 1;
			}
			arr[j + 1] = key;
		}

		for (int num : arr) {
			System.out.print(num+" ");
		}
	}

}
