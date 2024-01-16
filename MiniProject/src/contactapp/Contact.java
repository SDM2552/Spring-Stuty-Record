package contactapp;

import java.util.Scanner;

public class Contact {

	int selectNum;
	Scanner sc= new Scanner(System.in);
	TaskProcessor taskProcessor = new TaskProcessor();

	public void run(){

		while(true) {
			
			System.out.println("1.등록 | 2.보기 | 3.삭제 | 4.종료");
			System.out.print("선택> ");
			selectNum = Integer.parseInt(sc.nextLine());
			switch(selectNum) {
			
			case 1: // 등록
				System.out.println("등록");
				taskProcessor.register(sc);
				break;
			case 2: //보기
				System.out.println("보기");
				taskProcessor.search();
				break;
			case 3: //삭제
				System.out.println("삭제");
				taskProcessor.delete(sc);
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
