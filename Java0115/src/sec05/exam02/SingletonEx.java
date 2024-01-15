package sec05.exam02;

public class SingletonEx {

	public static void main(String[] args) {

//		SIngleton sing1 = new Singleton();
		SIngleton sing2 = SIngleton.getInstance();
		SIngleton sing3 = SIngleton.getInstance();

		if (sing2 == sing3) { // 객체의 메모리 주소 비교
			System.out.println("싱글턴은 항상 같은 객체가 서비스된다.");
		}
		if (sing2.equals(sing3)) { // 객체 자체가 같은지(여기서는 무의미)
			System.out.println("싱글턴은 항상 같은 객체가 서비스된다.");

		}

	}

}
