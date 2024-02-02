package sec01.exam01;

import java.util.ArrayList;
import java.util.List;

class Student {
	String name;
	int kor;

	/**
	 * @param name
	 */
	public Student(String name, int kor) {
		super();
		this.kor = kor;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", kor=" + kor + "]";
	}
	
}

public class ArrayListEx {

	public static void main(String[] args) {

		String[] strArr = new String[100]; // 고정형 배열, 속도빠름
		ArrayList<Student> slist = new ArrayList<Student>();
		slist.add(new Student("홍길동",99));
		slist.add(new Student("홍해아",30));
		slist.add(new Student("홍시",56));
		for(Student student:slist) {
			System.out.println(student);
		}


		ArrayList<String> alist = new ArrayList<String>();
		// '어레이리스트'. 문자열을 가변적인 배열로
		List<String> list = new ArrayList<>(); // 축약형
		list.add("홍길동");
		list.add("김하나");
		list.add("김둘");
		for (String str : list) {
			System.out.println(str);
		}
		list.set(1, "김셋");
		for (String str : list) {
			System.out.println(str);
		}
	}

}
