package sec05.exam02;

public class Person {
	public static final double PI=3.141592; //상수
	final static public double PI2=3.141592; // 수식어 순서 좀 바꿔도 되긴 함

	final String name;
	
	public Person(String name) {
		this.name=name;
	}

	public static void main(String[] args) {

//		Person person = new Person();
		Person person = new Person("홍길동");
//		person.name = "홍길동";
		final int x;
		x=300; // 초기화는 1번뿐
//		x=500;
	}

}
