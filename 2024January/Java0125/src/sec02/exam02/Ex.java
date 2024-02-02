package sec02.exam02;

class AnyClass{

	void anyMethod(){	
	
		throw new NullPointerException();
	}
}

public class Ex {

	public static void main(String[] args) {

		AnyClass ac = new AnyClass();
		ac.anyMethod();
	}

}
