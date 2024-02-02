package sec01.exam01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("이성계", 85);
		map.put("정몽주", 90);
		map.put("이방원", 80);
		map.put("이성계", 95);
		System.out.println("총 Entry 수: "+map.size());
		
		System.out.println("\t이성계: "+map.get("이성계"));
		System.out.println();
		
//		Set<String> keySet = map.keySet();
//		Iterator<String> keyIterator = keySet.iterator();
		
	}

}
