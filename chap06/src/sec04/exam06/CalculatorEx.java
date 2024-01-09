package sec04.exam06;

public class CalculatorEx {

	public static void main(String[] args) {
		
		Calculator myCal=new Calculator();
		
		//정사각형의 넓이 구하기
		double result1=myCal.areaRectangle(10.5);
		
		//직사각형의 넓이 구하기
		double result2=myCal.areaRectangle(10, 20.2);
		
		System.out.println("정사각형의 넓이: "+result1);
		System.out.println("직사각형의 넓이: "+result2);

	}

}
