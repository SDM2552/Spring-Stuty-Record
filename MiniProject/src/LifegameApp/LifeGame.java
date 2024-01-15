package LifegameApp;

import java.util.Scanner;

//Person Class의 객체가 company, bank, mart 클래스와 상호작용 하는거 연습

class Person {

	private int money;
	
	public Person(int money) {
		this.money = money;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public void earnMoney(int income) { // 이걸 만들었어야 했나??
		this.money += income;
	}
}

class Company {

	public int generateIncome() {
		System.out.println("일을 해서 1000원을 벌었습니다.");
		return 1000;
	}
}

class Bank {

	private int balance = 0;
	public void deposit(int amount) {
		this.balance += amount;
	}
	public int getBalance() {
		return balance;
	}
}

class Mart {

	private int property;
	public int getProperty() {
		return property;
	}
	public void setProperty(int property) {
		this.property = property;
	}
	public void income(int amount) {
		this.property += amount;
	}
}

class Act {

	public void workHard(Person person, Company company) {

		int earnMoney = company.generateIncome();
		person.earnMoney(earnMoney); // 밑에 banking이랑 다른 이유는?
		System.out.println("가진 재산: " + person.getMoney());
	}

	public void banking(Person person, Bank bank, Scanner sc) {

		System.out.println("얼마를 입급하시겠습니까?");
		System.out.print("입력> ");

		int deposit = sc.nextInt();

		bank.deposit(deposit);
		person.setMoney(person.getMoney() - deposit); // person.income(-deposit); 해도 작동함

		System.out.println("예금하고 남은 재산: " + person.getMoney());
		System.out.println("총 예금액: " + bank.getBalance());
	}

	public void buyItem(Person person, Mart mart, Scanner sc) {

		System.out.println("마트에서 2000원을 썼습니다.");
		person.setMoney(person.getMoney() - 2000);
		mart.income(2000);
		System.out.println("남은 재산: " + person.getMoney());
		System.out.println("마트가 번 돈: " + mart.getProperty());
	}

}

public class LifeGame {

	public static void main(String[] args) {

		Person minsu = new Person(10000);
		Company company = new Company();
		Bank bank = new Bank();
		Mart mart = new Mart();
		Act act = new Act();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("어디로 가시겠습니까?");
			System.out.println("1.회사 | 2.은행 | 3.마트 | 4.종료");
			System.out.print("선택> ");
			int choice = sc.nextInt();

			switch (choice) {

			case 1: // 회사
				System.out.println("회사");
				act.workHard(minsu, company);
				break;

			case 2: // 은행
				System.out.println("은행");
				act.banking(minsu, bank, sc);
				break;

			case 3: // 마트
				System.out.println("마트");
				act.buyItem(minsu, mart, sc);
				break;

			case 4: // 종료
				System.out.println("종료");
				sc.close();
				System.exit(0);
				break;

			default:

				System.out.println("다시 선택하십시오.");
			}
		}
	}
}