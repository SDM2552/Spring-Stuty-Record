package sec02.exam03;

import java.util.Scanner;

public class Car {
	Scanner sc=new Scanner(System.in);
	private int gas;
	boolean getGas;
	
	void SetGas(int gas) {
		this.gas=gas;
	}
	
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 있습니다.");
		return true;
	}
	
	void goToGas() {
		if (getGas=true)
			System.out.print("가스를 얼마나 넣을까요? ");
			gas+=sc.nextInt();
			run();
	}
	
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("달립니다.(gas잔량: "+gas+")");
				gas-=1;
				System.out.println("gas를 주입하러 가시겠습니까? (y)");
				if(sc.nextLine().equals("y")) {
					System.out.println("gas를 주입하러 갑니다.");
					getGas=true;
					return;
				}
			} else {
				System.out.println("멈춥니다.(gas잔량: "+gas+")");
				return;
			}
		}
	}
}
