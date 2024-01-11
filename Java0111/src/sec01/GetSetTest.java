package sec01;

class Human {
	private String name;
	private int year;
	private int month;
	private int day;

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	/**
	 * @param name
	 * @param year
	 * @param month
	 * @param data
	 */
	public Human(String name, int year, int month, int data) {
		this.name = name;
		this.year = year;
		this.month = month;
		this.day = data;
	}

	void printHumanBirth() {
		System.out.println(getName() + "의 생년월일");
		System.out.println(getYear() + "년\t" + getMonth() + "월\t" + getDay() + "일\n");
	}
}

public class GetSetTest {

	public static void main(String[] args) {
		
		Human IU=new Human("아이유",1993,5,16);
		Human minki=new Human("강민경",1990,8,3);
		Human haeri = new Human("이해리",1985,2,14);
		
		IU.printHumanBirth();
		minki.printHumanBirth();
		haeri.printHumanBirth();
		
	}

}
