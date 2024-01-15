package VendingMachineApp;

public class VendingMachine {

	public static void main(String[] args) {

		Person minsu = new Person(10000); //민수가 10000원을 갖고 자판기를 이용한다
		Machine machine = new Machine();

		machine.run(minsu);
	}

}
