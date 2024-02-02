package sec02.exam02;

public class ChildEx {

	public static void main(String[] args) {

		Child child = new Child();
		
		Parent parent=child;
		parent.methid1();
		parent.method2();
	}

}
