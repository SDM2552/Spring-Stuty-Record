package desigh.pattern.abstractfactory;

import java.util.Scanner;

public class Ex {

	public static void main(String[] args) {

//		CarFactory carFactory = new StateCarFactory();

		Scanner sc = new Scanner(System.in);

		CarFactory carFactory = null;
		System.out.println("생산하려는 차종 선택 (1.국산차, 2.미국차)");
		System.out.print("선택: ");
		String key = sc.nextLine();
		switch (key) {
		case "1":
			carFactory = new KoreaCarFactory();
			sc.close();
			break;
		case "2":
			carFactory = new StateCarFactory();
			sc.close();
		default:
			System.out.println("?");
			sc.close();
			break;
		}
		TirePrododuct tirePrododuct = carFactory.createTire();
		DoorProduct doorProduct = carFactory.createDoor();

		String tire = tirePrododuct.makeAssemble();
		String door = doorProduct.makeAssemble();
		System.out.println(tire);
		System.out.println(door);
	}

}
