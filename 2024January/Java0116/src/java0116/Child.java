package java0116;

class Parent {
	int money = 10000000;

	void dsip() {
		System.out.println(money);
	}
}

public class Child extends Parent {

	public Child() {
		this.money += 300;
	}

	public static void main(String[] args) {

		Child ch = new Child();
		ch.dsip();
//		System.out.println(ch.money);
	}
}
