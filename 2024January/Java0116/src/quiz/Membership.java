package quiz;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Membership {
	private Process process;

	public Membership(Process process) {
		this.process = process;
	}

	Scanner sc = new Scanner(System.in);
	ArrayList<Account> member = new ArrayList<>();
	int selectNum;
	
	public void run() throws IOException, ClassNotFoundException {

		while (true) {

			System.out.println("1.회원출력 | 2.회원등록 | 3.파일저장 | 4.파일읽기 |5.종료");
			System.out.print("선택> ");
			selectNum = Integer.parseInt(sc.nextLine());
			switch (selectNum) {

			case 1:
				System.out.println("회원출력");
				for (Account account : member) {
					System.out.println(account);
				}
				break;
			case 2:
				System.out.println("회원등록");
				process.register(sc);
				break;
			case 3:
				System.out.println("파일저장");
				process.saveFile();
				break;
			case 4:
				System.out.println("파일읽기");
				process.loadFile();
				member = process.member;
				break;
			case 5:
				System.out.println("종료");
				sc.close();
				return;
			default:
				break;
			}
		}
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Process process = new Process(new ArrayList<>());
		Membership membership = new Membership(process);
		membership.run();
	}
}
