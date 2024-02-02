package sec03.exam01;

public abstract class SmartPhone extends Phone{
	
	int x;
	
	
	
	public SmartPhone(String owner, int x, int x2) {
		super(x);
		x = x2;
	}



	public void printX() {
		System.out.println(x);
	}



	@Override
	public String ring(int tel) {
		return null;
	}

}
