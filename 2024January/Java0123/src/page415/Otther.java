package page415;

public class Otther {

	public void method2(int arg) {
		int localVariable = 1;
//		arg = 100;
//		localVariable = 100;

		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
}
