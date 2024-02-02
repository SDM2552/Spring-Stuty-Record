package sec02.exam04;

public class Anonymous {

	int field;

	public void method(int arg1, int arg2) {
		int var1 = 0;
		int var2 = 0;
		field = 10;
		Calculatable calc = new Calculatable() {

			@Override
			public int sum() {
				int result = field + arg1 + arg2 + var1 + var2;
				return result;
			}
		};
//		calc.sum(); //얘 혼자로는 사용 못함
//		int x= calc.sum() // 변수에 대입해서 쓰거나 print해서 써야함
		System.out.println(calc.sum());
	}

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		anony.method(0, 0);
	}
}
