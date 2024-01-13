package BandingMachineApp;

import java.util.Scanner;

public class Machine {

	private int money;
	private int water;
	private int coffee;
	private int coke;
	private int change;
	boolean run2 = true;
	private int selectDrink;

	public void insertCoin(Scanner sc, Customer customer) { // 1. 돈 넣기
		System.out.println("얼마를 넣으시겠습니까?");
		System.out.print("입력> ");
		int insertMoney = sc.nextInt();
		if (customer.getMoney() < insertMoney) { // 가진 돈보다 더 많이 넎으려하면
			System.out.println("돈이 부족합니다.");
		} else {
			customer.setMoney(customer.getMoney() - insertMoney);
			this.money += insertMoney;
			System.out.println("손님 남은돈: " + customer.getMoney()); // 디버그용
			System.out.println("자판기 받은 돈: " + money); // 디버그용
		}
	}

	public void selectDrink(Scanner sc) { // 2. 음료 선택 창

		while (run2) {

			Screen.disp2();
			System.out.print("선택> ");
			selectDrink = sc.nextInt();

			switch(selectDrink) {
			
			case 1:
				System.out.println("물을 구매하셨습니다.");
				break;
			case 2:
				System.out.println("커피를 구매하셨습니다.");
				break;
			case 3:
				System.out.println("콜라를 구매하셨습니다.");
				break;
			case 4:
				System.out.println("선택을 종료합니다.");
				run2=false;
				break;
			}
		}

	}

	public void returnCoin(Customer customer) { // 3. 잔돈 반환

		System.out.println("거스름돈 " + money + "원을 반환합니다.");

		System.out.println("손님 남은돈: " + customer.getMoney()); // 디버그용
		System.out.println("자판기 받은 돈: " + money); // 디버그용
	}

	public Machine(int money, int water, int coffee, int coke) {
		this.money = money;
		this.water = water;
		this.coffee = coffee;
		this.coke = coke;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getWater() {
		return water;
	}

	public void setWater(int water) {
		this.water = water;
	}

	public int getCoffee() {
		return coffee;
	}

	public void setCoffee(int coffee) {
		this.coffee = coffee;
	}

	public int getCoke() {
		return coke;
	}

	public void setCoke(int coke) {
		this.coke = coke;
	}

}
