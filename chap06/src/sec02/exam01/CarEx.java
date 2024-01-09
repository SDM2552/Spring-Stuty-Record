package sec02.exam01;

public class CarEx {

	public static void main(String[] args) {
		
		String str="가나다"; // 지역변수
		
		Car car3=new Car("현대자동차");
		System.out.println(car3);
		
		Car car4=new Car("현대","코나","ver.1",150);
		
		Car car = new Car();
		
		car.company="기아";
		car.color="빨강";
		car.model="K7";
		car.maxSpeed=200;
		
		System.out.println(car);
		
		Car car2=new Car();
		System.out.println(car2);
	}

}
