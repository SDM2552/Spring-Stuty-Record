package sec01.exam01;

public class AccountEx {

	public static void main(String[] args) {
		Account acc = new Account();
		acc.name = "김하나";
		acc.ssn = "911224";
		acc.tel = "010-1234-1234";
		acc.age = 20;
		System.out.println(acc);

		Account acc1 = new Account("김둘", "990101", "010-3434-3434", 30);
		System.out.println(acc1);
	}

}
