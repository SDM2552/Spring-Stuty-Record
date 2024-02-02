package contactapp;

import java.util.Scanner;

public class TaskProcessor {

	private String[][] contactList = new String[10][3]; // 10명 까지 등록 가능
	int number = 0; // 등록번호
	String name;
	String tel;
	String email;
	String deleteMember;
	String[][] target = new String[10][3];

	// 1. 등록
	public void register(Scanner sc) {
		if (number >= 10) {
			System.out.println("주소록이 꽉 찼습니다. 삭제를 먼저 하십시오.");
		} else {
			System.out.print("이름: ");
			contactList[number][0] = sc.nextLine();
			System.out.print("전화번호: ");
			contactList[number][1] = sc.nextLine();
			System.out.print("이메일: ");
			contactList[number][2] = sc.nextLine();
			number++;
		}
	}

	// 2. 보기
	public void search() {
		for (int i = 0; i < number; i++) {
			System.out.print(i + 1 + ". ");
			System.out.print("이름: " + contactList[i][0]);
			System.out.print("\t전화번호: " + contactList[i][1]);
			System.out.println("\t이메일: " + contactList[i][2]);

		}
	}

	// 3. 삭제
	public void delete(Scanner sc) { // 오 생각보다 어려운데
		System.out.print("삭제할 사람의 이름: ");
		deleteMember = sc.nextLine();
		boolean found = false;

		for (int i = 0; i < number; i++) { // 리스트에서 검색
			if (contactList[i][0].equals(deleteMember)) { // 해당 사람을 찾으면
				found = true;

				for (int j = 0; j < 3; j++) {
					target[i][j] = contactList[i][j]; // 타겟=삭제할사람
				}
				for (int j = i; j < number - 1; j++) {
					for (int k = 0; k < 3; k++) {
						contactList[j][k] = contactList[j + 1][k];
					}
				}
				System.out.println(deleteMember + "을(를) 삭제했습니다.");
				number--;
				break;
			}
		}
		if (!found) {
			System.out.println("해당 이름이 없습니다.");
		}
	}

}
