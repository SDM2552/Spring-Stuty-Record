package VendingMachineApp;

public class Screen {

	public void menu1() {
		System.out.println("-------------------------------------");
		System.out.println("1.돈 넣기 | 2.음료 선택 | 3.잔돈 반환 | 4. 떠나기");
		System.out.println("-------------------------------------");
	}

	public static void menu2() { //위에는 static이 아닌데..
		System.out.println("-------------------------------------");
		System.out.println("1.물(500) | 2.커피(700) | 3.콜라(1000) | 4.종료");
		System.out.println("-------------------------------------");
	}
}
