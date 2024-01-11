package sec05.exam01;

public class Myclass {
	
	int x;
	int y;
	int z;

	public Myclass(int x) {
		this(x, 0);
		System.out.println("1번째 생성자");
	}

	public Myclass(int x, int y) {
		this(x, y, 0);
		System.out.println("2번째 생성자");
	}

	public Myclass(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
		System.out.println("3번째 생성자");
	}

	public static void main(String[] args) {
		Myclass mc = new Myclass(100); 
	}
}