package sec02.exam01;

import java.util.Scanner;

public class ContinueEx {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[] { 1, 2, 3, 4, 5 };
		int[] arr2 = null;
		
		System.out.print("크기: ");
		int size = sc.nextInt();
		
		arr=arr2;
		
		arr2=new int[size];

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr2[i]);
		}
		
		arr2[1]=100;
		System.out.println(arr[1]);
		sc.close();
	}
}
