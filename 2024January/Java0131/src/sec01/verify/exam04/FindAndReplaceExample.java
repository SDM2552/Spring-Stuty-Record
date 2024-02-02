package sec01.verify.exam04;

public class FindAndReplaceExample {
	public static void main(String[] args) {

		String str = "모든 프로그램은 자바 언어로 개발될 수 있다.";
		int index = str.indexOf("자바");
		System.out.println(index);
		if (index != -1) {
			str = str.replaceAll("자바", "JAVA");
			System.out.println(str);
		}

	}
}
