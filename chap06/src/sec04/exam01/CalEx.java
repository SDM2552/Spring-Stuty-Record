package sec04.exam01;

public class CalEx {

	
	
	public static void main(String[] args) {
		
		Cal cal = new Cal();
		cal.power();
		cal.x=100;
		cal.printX();
		Cal.sx=150;
		
		Cal cal2= new Cal(1000);
		System.out.println(cal2.x);
		cal2.power();
	}

}
