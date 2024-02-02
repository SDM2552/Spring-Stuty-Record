package sec02.exam04;

import java.util.Scanner;

public class DriverExample {

	public static void main(String[] args) {

		Driver driver = new Driver();
//		Taxi taxi = new Taxi();
//		driver.driver(new Bus());
//		driver.driver(taxi);
		Scanner sc = new Scanner(System.in);
		System.out.println("이동할 차량을 선택하세요. (1.버스, 2.택시)");
		System.out.print("번호: ");
		int num = Integer.parseInt(sc.nextLine());
		Vehicle vehicle = null;
		switch (num) {
		case 1:
			vehicle = new Bus();
			break;
		case 2:
			vehicle = new Taxi();
			break;

		default:
			break;
		}
		sc.close();
		driver.driver(vehicle);
	}

}
