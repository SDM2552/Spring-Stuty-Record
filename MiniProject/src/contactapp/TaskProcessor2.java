package contactapp;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class TaskProcessor2 {
	Scanner sc = new Scanner(System.in);
	ArrayList<Member> contactlist2 = new ArrayList<>(); // 생성

//	private String[][] contactList = new String[10][3]; // 10명 까지 등록 가능
	int number = 0; // 등록번호
	String name;
	String tel;
	String email;
	String deleteMember;
	String[][] target = new String[10][3];

	// 1. 등록
	public void register(Scanner sc) {
		if (number >= 10) {
			System.out.println("주소록이 꽉 찼습니다. 삭제를 먼저 해주세오.");
		} else {
			System.out.print("이름: ");
			String name = sc.nextLine();
			System.out.print("전화번호: ");
			String tel = sc.nextLine();
			System.out.print("이메일: ");
			String email = sc.nextLine();
			contactlist2.add(new Member(name, tel, email));
			number++;
		}
	}

	// 2. 보기
	public void search() {
		for (int i = 0; i < number; i++) {
			System.out.print(i + 1 + ". ");
			System.out.println(contactlist2.get(i));
		}
	}

	// 3. 삭제
	public void delete(Scanner sc) { // 오 생각보다 어려운데
		System.out.print("삭제할 사람의 이름: ");
		deleteMember = sc.nextLine();
		Iterator<Member> iterator = contactlist2.iterator();
		while (iterator.hasNext()) {
			Member row = iterator.next();
			if (row.getName().equals(deleteMember)) {
				iterator.remove();
				System.out.println(deleteMember + "님의 정보가 삭제되었습니다.");
				number--;
				break;
			}
		}
	}

	// 4.저장
	public void saveToFile() throws IOException {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:/temp/member.db"))) {
			oos.writeObject(contactlist2);
			System.out.println("저장 완료");
		} catch (IOException e) {
			System.out.println("저장 중 오류가 발생했습니다.");
			e.printStackTrace();
		}
	}

	// 5.로드
	public void loadFronFile() throws IOException, ClassNotFoundException {
		
	
//		FileInputStream fis = new FileInputStream("C:/temp/member.db");
//		ObjectInputStream ois = new ObjectInputStream(fis);
//		ArrayList<Member> loadedList = (ArrayList<Member>) ois.readObject();
//		contactlist2.clear();
//		contactlist2.addAll(loadedList);
//		System.out.println("로드 완료");
		 try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:/temp/member.db"))) {
		        ArrayList<Member> loadedList = (ArrayList<Member>) ois.readObject();
		        contactlist2.clear();
		        contactlist2.addAll(loadedList);
		        System.out.println("로드 완료");
		    } catch (FileNotFoundException e) {
		        System.out.println("파일을 찾을 수 없습니다.");
		        e.printStackTrace();
		    } catch (IOException e) {
		        System.out.println("로드 중 오류가 발생했습니다.");
		        e.printStackTrace();
		    } catch (ClassNotFoundException e) {
		        System.out.println("클래스를 찾을 수 없습니다.");
		        e.printStackTrace();
		    }
	
		

	}
}
