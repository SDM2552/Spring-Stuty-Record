package banksystem;

import java.util.Scanner;

public class BankSite {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String name;
		int password;
		String number;

		System.out.println("[필수 정보 입력]");
		System.out.print("1. 이름: ");
		name = sc.nextLine();
		System.out.print("2. 주민번호 앞 6자리: ");
		password = Integer.parseInt(sc.nextLine());
		System.out.println("3. 전화번호: ");
		number = sc.nextLine();

		System.out.println("회원 가입이 완료되었습니다. 로그인을 해 주세요.");
/* ========================= 2단계 =============================== */
		String name2;
		int strPassword;

		System.out.print("아이디: ");
		name2 = sc.nextLine();
		System.out.print("패스워드: ");
		strPassword = Integer.parseInt(sc.nextLine());

		
		boolean check = false;
		if (name.equals(name)) {
			if (strPassword == password) {
				System.out.println("로그인 성공");
				check=true;
			} else {
				System.out.println("로그인 실패:패스워드가 틀림");
			}

		} else {
			System.out.println("로그인 실패:아이디 존재하지 않음");
		}
/* ========================= 3단계 =============================== */
		if(check) {
			boolean run = true;
			int balance = 0;

			while (run) {
				System.out.println("---------------------------");
				System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료 ");
				System.out.println("---------------------------");
				System.out.print("선택>");

				int choose = Integer.parseInt(sc.nextLine());
				switch (choose) {
				case 1:
					System.out.print("예금액>");
					balance += Integer.parseInt(sc.nextLine());
					break;

				case 2:
					System.out.print("출금액>");
					balance -= Integer.parseInt(sc.nextLine());
					break;

				case 3:
					System.out.println("잔고> " + balance);
					break;

				case 4:
					run = false;
					break;
				}
			}
			sc.close();
			System.out.println("프로그램 종료"); 
		}
	}
}
