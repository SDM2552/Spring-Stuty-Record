package sec05.exam02;

public class StudentEx {

	public static void main(String[] args) {

		Studentservice ss = Studentservice.getInstance();
		ss.stu.name="이순신";
		ss.stu.hakbun="241010";
		ss.stu.kor=92;
		ss.stu.eng=86;
		ss.stu.math=95;
		
		Studentservice ss1= Studentservice.getInstance();
		System.out.println(ss.stu.name);
		System.out.println(ss1.stu.name);
		
		if(ss.stu.equals(ss1.stu)) {
			System.out.println("같다");
		}
		if(ss.stu==ss1.stu) {
			System.out.println("같다");
		}
	}

}
