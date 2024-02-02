package sec05.exam02;

public class Studentservice {

	Student stu = new Student();
	private static Studentservice singleton = new Studentservice();
	private Studentservice() {
		
	}
	public static Studentservice getInstance() {
		//여기에 추가제약을 넣던가
		return singleton;
	}
}
