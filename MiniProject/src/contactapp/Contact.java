package contactapp;

import java.io.IOException;
import java.util.Scanner;

public class Contact {

	int selectNum;
	private Scanner sc;
	private TaskProcessor2 taskProcessor2;

	public Contact(Scanner sc, TaskProcessor2 taskProcessor2) {
		this.sc = sc;
		this.taskProcessor2 = taskProcessor2;
	}

	public void run() throws IOException, ClassNotFoundException{

		while(true) {
			
			System.out.println("1.등록 | 2.보기 | 3.삭제 | 4.저장 | 5.로드 | 6.종료 ");
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
			case 4:
				System.out.println("저장");
				taskProcessor2.saveToFile();

				break;
			case 5:
				System.out.println("로드");
				taskProcessor2.loadFronFile();
				break;
			case 6: //종료
				System.out.println("종료");
				sc.close();
				return;
			default:
				break;
				
			}
			
		}
	}
}
