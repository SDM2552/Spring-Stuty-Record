package sec01.exam01;

class ThrowClass{
	void method(int x) throws Exception {
		if(x>10) {
		throw new Exception("!!!!!!!!!!!!!!!!!!!예외 발생!!!!!!!!!!!!!!!!!!!");
		} else {
			System.out.println(x);
		}
	}
}

public class ThrowEx {

	public static void main(String[] args) {

		ThrowClass tc = new ThrowClass();
		try {
			tc.method(11);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
