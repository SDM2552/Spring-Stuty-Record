package VendingMachineApp;

import java.util.Scanner;

class Drink {

}

public class Machine {

	// 음료의 가격
	int waterCost = 500; // <- static final 붙이고 싶었음
	int coffeeCost = 700;
	int cokeCost = 1000;

	// 음료의 수량
	private int waterAmount;
	private int coffeeAmount;
	private int cokeAmount;

	// 자판기 돈
	private int money;
	private int profit;
	private int change;
	boolean run2 = true;
	private int selectDrink;
	private int insertMoney;

	public void insertCoin(Scanner sc, Customer customer) { // 1. 돈 넣기
		System.out.println("얼마를 넣으시겠습니까?");
		System.out.print("입력> ");
		insertMoney = sc.nextInt();
		if (customer.getMoney() < insertMoney) { // 가진 돈보다 더 많이 넎으려하면
			System.out.println("돈이 부족합니다.");
		} else {
			customer.setMoney(customer.getMoney() - insertMoney);
			this.money += insertMoney;
			System.out.println("손님 남은돈: " + customer.getMoney()); // 디버그용
			System.out.println("자판기 받은 돈: " + money); // 디버그용
		}
	}

	private void purchaseDrink(int selectedDrink, int drinkCost, String drinkName) {
		if(money<drinkCost) {
			System.out.println(drinkName+"을(를) 구매할 잔액이 부족합니다. 잔액: "+money+"원");
		} else {
			money -= drinkCost;
			profit += drinkCost;
			System.out.println(drinkName+"을(를) 구매하셨습니다.");
		}
	}

	public void selectDrink(Scanner sc) { // 2. 음료 선택 창

		while (run2) {

			Screen.disp2();
			System.out.print("선택> ");
			selectDrink = sc.nextInt();

			switch (selectDrink) {

			case 1:
				purchaseDrink(1, waterCost, "물");
				break;
			case 2:
				purchaseDrink(2, coffeeCost, "커피");
				break;
			case 3:
				purchaseDrink(3, cokeCost, "콜라");
				break;
			case 4:
				System.out.println("선택을 종료합니다.");
				run2 = false;
				break;
			}
		}

	}

	public void returnCoin(Customer customer) { // 3. 잔돈 반환

		System.out.println("거스름돈 " + money + "원을 반환했습니다.");
		customer.setMoney(customer.getMoney()+money);
		money=0;
		System.out.println("손님 남은돈: " + customer.getMoney()); // 디버그용
		System.out.println("자판기 번 돈: " + profit); // 디버그용
	}

	public Machine(int money, int waterAmount, int coffeeAmount, int cokeAmount) {
		this.money = money;
		this.waterAmount = waterAmount;
		this.coffeeAmount = coffeeAmount;
		this.cokeAmount = cokeAmount;
	}

	
}
