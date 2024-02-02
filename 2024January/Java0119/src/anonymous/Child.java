package anonymous;

class Parent{
	void method() {}
}

public class Child extends Parent {

	public static void main(String[] args) {

		new Child();
		
		new Parent() { //익명의 자식 개체, 바로 위의 new Child랑은 형제
			@Override
			void method() {
				super.method();
			}
		};
	}

}
