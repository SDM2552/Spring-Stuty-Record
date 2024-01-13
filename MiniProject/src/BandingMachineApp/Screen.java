package BandingMachineApp;

import java.util.Scanner;

public class Screen {

static Scanner sc = new Scanner(System.in);
Customer customer = new Customer(10000);


	
	public Screen(boolean run) {
		this.run = run;
	}

	Machine machine = new Machine(0,3,3,3);

	boolean run;

	public void disp1() {
		System.out.println("-------------------------------------------");
		System.out.println("1.돈 넣기 | 2.음료 선택 | 3.잔돈 반환 | 4.나가기 | 9.?");
		System.out.println("-------------------------------------------");
	}

	public static void disp2() {
		System.out.println("-------------------------------------------");
		System.out.println("1.물(500) | 2.커피(700) | 3.콜라(1000) | 4.나가기");
		System.out.println("-------------------------------------------");
	}

	public void menu() {

		System.out.println("어서오세요. 자판기 입니다.");
		

		while (run) {
			
			disp1();
			System.out.print("선택>");
			int selectNum = sc.nextInt();

			switch (selectNum) {

			case 1: // 돈 넣기
				System.out.println("돈을 넣습니다.");
				machine.insertCoin(sc, customer);
				break;
			case 2: // 음료 선택
				System.out.println("음료를 선택합니다.");
				machine.selectDrink(sc);
				break;
			case 3: // 잔돈 반환
				System.out.println("잔돈을 반환합니다.");
				machine.returnCoin(customer);
				break;
			case 4: // 나가기
				System.out.println("감사합니다. 또 오세요.");
				run = false;
				break;
			case 9: // 자판기 관리
				System.out.println("자판기를 엽니다. 비밀번호를 입력하세요.");
			}
		}

	}
}
