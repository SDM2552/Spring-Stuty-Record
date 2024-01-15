package VendingMachineApp;

import java.util.Scanner; //머신에 넣었는데 또 넣어야 함?

public class Process {

	private int insert; // 투입한 금액
	int coin;
	private int income; // 자판기 수익
	
	
	public int getIncome() {
		return income;
	}
	public void setIncome() {
		System.out.println(income);
	}

	// 1. 돈 넣기
	public int insertMoney(Machine machine, Person person, Scanner sc) {
		System.out.println("돈을 얼마 넣으시겠습니까?");
		System.out.print("입력> ");
		coin = sc.nextInt();
		person.setMoney(person.getMoney() - coin);
		System.out.println("사람 남은 돈: " + person.getMoney());
		System.out.println("자판기 투입한 돈: " + (insert+coin));
		return insert+=coin;
	}

	// 2. 음료 선택
	public int selectDrink(Scanner sc, Person person, Machine machine) {

		while (true) {

			Screen.menu2();
			System.out.print("선택> ");
			int selectNum = sc.nextInt();

			switch (selectNum) {
			case 1: // 물
				buyDrink(500, "물");
				break;
			case 2: // 커피
				buyDrink(700, "커피");
				break;
			case 3: // 콜라
				buyDrink(1000, "콜라");
				break;
			case 4: // 종료
				return income;
				
			default:
				break;
			}
		}
	}
	public void buyDrink(int drinkCost, String drinkName) {
		if (insert < drinkCost) {
			System.out.println("잔액이 부족합니다.");
		} else {
			insert -= drinkCost;
			income += drinkCost;
			System.out.println(drinkName+"를(을) 구매했습니다. 잔액 "+insert+"원");
		}
	}
	
	// 3.잔액 반환
	public void returnBalance(Person person) {
		System.out.println("잔액 "+insert+"원을 반환합니다.");
		person.setMoney(person.getMoney()+insert);
	}

}
