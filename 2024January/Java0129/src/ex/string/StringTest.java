package ex.string;

public class StringTest {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		String str="";
		
		long time1 = System.currentTimeMillis();
		for(int i=0;i<100000; i++) {
			sb.append("a");
//			str+="a";
//			str=str.concat("a");
		}
		long time2 = System.currentTimeMillis();
		System.out.println("연산시간: "+(time2-time1)+" 밀리초");
	}

}
