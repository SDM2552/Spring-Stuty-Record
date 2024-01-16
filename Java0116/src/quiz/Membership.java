package quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class Membership {
	ArrayList<Account> member = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	int selectNum;
	Process process = new Process(member);

//	public void run(Account account, Process process) {
	public void run() {

		while (true) {

			System.out.println("1.회원출력 | 2.회원등록 | 3.파일저장 | 4.파일읽기 |5.종료");
			System.out.print("선택> ");
			selectNum = Integer.parseInt(sc.nextLine());
			switch (selectNum) {

			case 1:
				System.out.println("회원출력");
//				System.out.println(account.toString());
				for (Account account : member) {
					System.out.println(account);
				}
				break;
			case 2:
				System.out.println("회원등록");
//				process.register(sc, account);
				process.register(sc);
				
				break;
			case 3:
				System.out.println("파일저장");
//				process.deposit(sc, account);
				break;
			case 4:
				System.out.println("파일읽기");
//				process.withdraw(sc, account);

				break;
			case 5:
				System.out.println("종료");
				sc.close();
				return;
			default:
				break;
			}

		}

	}

	public static void main(String[] args) {
//		Account account = new Account("", "", "", "", "");
//		Process process = new Process();
		
		Membership membership = new Membership();
//		membership.run(account, process);
		membership.run();
	}
}
