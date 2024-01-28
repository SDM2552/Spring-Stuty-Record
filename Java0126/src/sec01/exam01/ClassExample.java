package sec01.exam01;

class Car{}

public class ClassExample {

	public static void main(String[] args) throws ClassNotFoundException {

		Class clazz = Car.class; //1
		
		String str = clazz.getResource("photo2.jpg").getPath(); // 리소스 절대 경로 얻기
		System.out.println(str);
		String str2 = clazz.getResource("images/photo2.jpg").getPath();
		System.out.println(str2);
		
		
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackageName());
		System.out.println("----------------------");
		
		//2
		Class clazz2 = Class.forName("sec01.exam01.Car");
		System.out.println(clazz2.getName());
		System.out.println(clazz2.getSimpleName());
		System.out.println(clazz2.getPackageName());
		System.out.println("----------------------");

		
		//3
		Car car = new Car();
		Class clazz3 = car.getClass();
		System.out.println(clazz3.getName());
		System.out.println(clazz3.getSimpleName());
		System.out.println(clazz3.getPackageName());
		
	}

}
