package sec05.exam02;

public class SIngleton {
	//private 접근제한은 자신 클래스 내에서만 접근 가능
	private static SIngleton singleton = new SIngleton();
	private SIngleton() {} //생성자를 private으로 하면?
	
	
	static SIngleton getInstance() { //사용법은 오직 이 메소드만 호출
		return singleton;
	}

}
