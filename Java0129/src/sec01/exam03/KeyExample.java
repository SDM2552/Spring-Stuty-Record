package sec01.exam03;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {

		HashMap<Key, String> hashmap = new HashMap<Key, String>();
		hashmap.put(new Key(1), "홍길동"); //new Key(1)의 생성 타이밍은?
		
		String value = hashmap.get(new Key(1)); //얘는 위에꺼랑 다르게 생성된 new Key(1)
		System.out.println(value);
	}

}

