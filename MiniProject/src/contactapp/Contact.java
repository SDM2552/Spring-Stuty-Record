package contactapp;

import java.util.Scanner;

public class Contact {

	int selectNum;
	Scanner sc= new Scanner(System.in);
	TaskProcessor2 taskProcessor2 = new TaskProcessor2(); //2를 붙이면

	public void run(){

		while(true) {
			
			System.out.println("1.등록 | 2.보기 | 3.삭제 | 4.종료");
			System.out.print("선택> ");
			selectNum = Integer.parseInt(sc.nextLine());
			switch(selectNum) {
			
			case 1: // 등록
				System.out.println("등록");
				taskProcessor2.register(sc);
				break;
			case 2: //보기
				System.out.println("보기");
				taskProcessor2.search();
				break;
			case 3: //삭제
				System.out.println("삭제");
				taskProcessor2.delete(sc);
				break;
			case 4: //종료
				System.out.println("종료");
				sc.close();
				return;
			default:
				break;
				
			}
			
		}
	}
}
