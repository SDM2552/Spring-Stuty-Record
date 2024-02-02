package java0116;

public class Student extends People{
	
	String hakbun;


	public Student(String hakbun) {
		super("이순신"); // 부모의 생성자 호출
		this.hakbun = hakbun;
	}


	@Override
	void method1() { // 부모 메소드를 덮어쓰는데 매게변수를 추가하고 싶다면?
		super.method1();
	}
	
}
