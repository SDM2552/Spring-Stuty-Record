package sec01.exam22;

public class BoxingUnBoxingExample {

	public static void main(String[] args) {

		Integer obj1 = new Integer(100);
		Integer obj2 = 200;
		Integer obj3 = new Integer("300");
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);

		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
	}

}
