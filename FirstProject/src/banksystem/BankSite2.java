package banksystem;

import java.util.Scanner;

public class BankSite2 {

	public static void main(String[] args) {

		String name = "admin";
		int password = 12345;
		String number;

		String name2;
		int strPassword;
		int choose1;
		boolean firstCheck = true;
		boolean check = false;

		Scanner sc = new Scanner(System.in);

		while (firstCheck) {
			System.out.println("----------------------------------");
			System.out.println("1.로그인 | 2.회원가입 | 3.예금/출금 | 4.종료 ");
			System.out.println("----------------------------------");
			System.out.print("선택>");

			choose1 = Integer.parseInt(sc.nextLine());

			switch (choose1) {

			case 1:

				System.out.print("아이디: ");
				name2 = sc.nextLine();
				System.out.print("패스워드: ");
				strPassword = Integer.parseInt(sc.nextLine());

				if (name2.equals(name)) {
					if (strPassword == password) {
						System.out.println("로그인 성공");
						check = true;
						break;
					} else {
						System.out.println("로그인 실패:패스워드가 틀림");
					}

				} else {
					System.out.println("로그인 실패:아이디 존재하지 않음");
					break;
				}
				/* ========================= 2단계 =============================== */
			case 2:

				System.out.println("[필수 정보 입력]");
				System.out.print("1. 이름: ");
				name = sc.nextLine();
				System.out.print("2. 주민번호 앞 6자리: ");
				password = Integer.parseInt(sc.nextLine());
				System.out.println("3. 전화번호: ");
				number = sc.nextLine();

				System.out.println("회원 가입이 완료되었습니다. 로그인을 해 주세요.");
				break;
			/* ========================= 3단계 =============================== */
			case 3:

				if (check) {
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
				} else {
					System.out.println("로그인을 먼저 해주세요.");
					break;
				}
			case 4:
				sc.close();
				firstCheck = false;
				break;
			}
		}
	}
}
