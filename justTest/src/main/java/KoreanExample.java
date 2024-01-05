
class Korean {
	String nation="대한민국";
	String name;
	String ssn;
	
	
	public Korean(String n, String s) {
		name=n;
		ssn=s;
	}
}

public class KoreanExample {
	public static void main(String[] args) {
		
		Korean k1=new Korean("박자바", "123-123");
		System.out.println("k1.name: "+k1.name);
		System.out.println("k1.ssn: "+k1.ssn);

	}

}
