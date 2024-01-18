package sec02.exam06;

public class InstanceofExample {

	public static void method1(Parent parent) {

	}

	public static void method2(Parent parent) {

		Child child = (Child) parent;
		System.out.println("method2 - Child로 형변환 성공!");
	}

	public static void main(String[] args) {

		Parent parentA = new Child();
		method1(parentA);
		method2(parentA);

//		Parent parentB = new Parent();
		Parent parentB = new Child();

		if(parentB instanceof Child) {
			
			method2(parentB);
		} else {
			System.out.println("형변환 불가");
		}
		method1(parentB);

	}

}
