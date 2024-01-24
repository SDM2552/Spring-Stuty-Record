package sec02.exam01;

import page424.Parent;

public class AnonymousEx {

	public static void main(String[] args) {

		Anonymous anonymous = new Anonymous(); 
		anonymous.field.wake(); //익명 개체 필드 사용
		anonymous.method1(); // 익명 개체 로컬 변수 사용

		anonymous.method2(new Person() {// 익명 개체 매개변수 사용
			void study() {
				System.out.println("공부합니다.");
			}

			@Override
			void wake() {
				System.out.println("8시에 일어납니다.");
				study();
			}
		});
	}

}
