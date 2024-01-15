package VendingMachineApp;

import java.util.Scanner;

public class Machine {

	Screen screen = new Screen();
	Scanner sc = new Scanner(System.in);
	Process process = new Process();

	boolean run = true;
	
	final int waterCost=500; 
	final int coffeeCost=700;
	final int cokeCost=1000;

	public void run(Person person) {
		
		while (run) {

			screen.menu1();

			System.out.print("선택> ");
			int selectNum = sc.nextInt();

			switch (selectNum) {

			case 1:
				System.out.println("돈 넣기");
				process.insertMoney(this, person, sc);
				break;
			case 2:
				System.out.println("음료 선택");
				process.selectDrink(sc, person, this);
				break;
			case 3:
				System.out.println("잔돈 반환");
				process.returnBalance(person);
				break;
			case 4:
				System.out.println("감사합니다. 또 오세요.");
				sc.close();
				run = false;
				break;
			default:
				System.out.println("다시 입력하세요");
				break;
			}
		}
	}
}
