package sec01;

public class Passing1 {

	
	
	public static void main(String[] args) {
		int x=100; //지역 변수
		int num=method1(x); //호출(이름으로 실행시킨다.)
		System.out.println(num);
	}

	public static int method1(int y) { // 함수, 메소드
			//y도 지역변수(단, 호출한 곣에서 값을 넘겨 줘야 한다.)
		y+=1;
		return y; //리턴
	}
}
