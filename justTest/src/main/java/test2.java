import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		sc.close();
		int a= sc.nextInt();
		if(a>89 && a<101) {
			System.out.println("A");
		} else if(a>79 && a<90) {
			System.out.println("B");
		} else if(a>69 && a<80) {
			System.out.println("C");
		} else if(a<70) {
			System.out.println("F");
		} else {
			System.out.println("ERROR");
		}
	}
}
