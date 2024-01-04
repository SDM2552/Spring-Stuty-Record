class Student {
	public String studentName;
	public int money;
	
	public Student(String studentName, int money) {
		this.studentName=studentName;
		this.money=money;
	}
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -=1000;
	}
	public void takeSubwat(Subway subway) {
		subway.take(1500);
		this.money-=1500;
	}
	public void showInfo() {
		System.out.println(studentName+"님의 남은 돈은"+money+"입니다.");
	}
}
class Bus{
	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int busNumber) {
		this.busNumber=busNumber;
	}
	public void take(int money) {
		this.money+=money;
		passengerCount++;
	}
	public void showInfo() {
		System.out.printf("버스 %d번의 승객은 %d명이고, 수입은 %d 입니다.",busNumber,passengerCount,money);
	}
}
class Subway{
	String lineNumber;
	int passengerCount;
	int money;
	
	public Subway(String lineNumber) {
		this.lineNumber=lineNumber;
	}
	
	public void take(int money) {
		this.money+=money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.printf("%d번의 승객은 %d명이고, 수입은 %d 입니다.",lineNumber,passengerCount,money);
	}
}

public class TakingBus {	
	public static void main(String[] args) {
		
		Student studentJames=new Student("James",5000);
		Student studentTomas=new Student("Tomas",10000);		
		Bus bus100=new Bus(100);
		studentJames.takeBus(bus100);
		studentJames.showInfo();
		bus100.showInfo();
		
		Subway subwayGreen=new Subway("2호선");
		studentTomas.takeSubwat(subwayGreen);
		studentTomas.showInfo();
		subwayGreen.showInfo();
		
		
		
	}
}
