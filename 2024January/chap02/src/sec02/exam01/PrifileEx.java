package sec02.exam01;

import java.util.Scanner;

public class PrifileEx {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String name;
		int password;
		int number;
		
		System.out.println("[필수 정보 입력]");
		System.out.print("1. 이름: ");
		name=sc.nextLine();
		System.out.print("2. 주민번호 앞 6자리: ");
		password=sc.nextInt();
		System.out.println("3. 전화번호: ");
		number=sc.nextInt();
		
		sc.close();
		
		System.out.println("[입력한 내용]");
		System.out.printf("%s\n%d\n%s",name,password,number);
	}

}
