package sec02.exam01;

public class Car {

	String company; // 객체
	String model;
	String color;
	int maxSpeed;
	
	public Car() {
		System.out.println("Car()");
	}
	
	
	public Car(String company, int maxSpeed) {
		super();
		this.company = company;
		this.maxSpeed = maxSpeed;
	}



	public Car(String company) {
		this.company=company;
	}
	public Car(String company, String model) {
		this.company=company;
		this.model=model;
	}public Car(String company, String model, String color, int maxSpeed) {
		this.company=company;
		this.model=model;
		this.color=color;
		this.maxSpeed=maxSpeed;
	}
	@Override
	public String toString() {
		return "Car [company=" + company + ", model=" + model + ", color=" + color + ", maxSpeed=" + maxSpeed + "]";
	}
	
}
