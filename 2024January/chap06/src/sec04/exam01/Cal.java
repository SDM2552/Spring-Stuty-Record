package sec04.exam01;

public class Cal {
	
	static int sx;
	int x=10;
	
	public Cal() {	
	}
	
	public Cal(int x) {
		this.x=x;
	}
	
	void power() {
		System.out.println("전원을 켭니다.");
		System.out.println("sx: "+sx);
	}

	void printX() {
		System.out.println(x);
	}
}
