package quiz;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Process {
	ArrayList<Account> member;

	public Process(ArrayList<Account> member) {
		this.member = member;
	}
	
	

	public void register(Scanner sc) { //회원등
		Account account = new Account();
		System.out.print("이름 입력: ");
		account.setName(sc.nextLine());
		System.out.print("ID 입력: ");
		account.setId(sc.nextLine());
		System.out.print("비밀번호 입력: ");
		account.setPass(sc.nextLine());
		System.out.print("전화번호 입력: ");
		account.setTel(sc.nextLine());
		System.out.print("생년월일 입력: ");
		account.setSsn(sc.nextLine());
		member.add(account);
	}

//	int depositMoney;
//	int withdrawMoney;
//
//	// 입금
//	public void deposit(Scanner sc, Account account) {
//
//		System.out.println("얼마를 입금하시겠습니까?");
//		System.out.print("입력> ");
//		depositMoney = Integer.parseInt(sc.nextLine());
//		account.setMoney(account.getMoney() - depositMoney);
//		account.setBalance(account.getBalance() + depositMoney);
//		System.out.printf("%d원을 맡겼습니다. 현재 돈:%d, 맡긴 돈:%d\n", depositMoney, account.getMoney(), account.getBalance());
//	}

//	// 출금
//	public void withdraw(Scanner sc, Account account) {
//
//		System.out.println("얼마를 출금하시겠습니까?");
//		System.out.print("입력> ");
//		depositMoney = Integer.parseInt(sc.nextLine());
//		account.setMoney(account.getMoney() + depositMoney);
//		account.setBalance(account.getBalance() - depositMoney);
//		System.out.printf("%d원을 찾았습니다. 현재 돈:%d, 맡긴 돈:%d\n", depositMoney, account.getMoney(), account.getBalance());
//	}
	
	//파일 저장
	public void saveFile() throws IOException {
		
		FileOutputStream fos = new FileOutputStream("c:/temp/membership.db"); //쓰기
		ObjectOutputStream oos = new ObjectOutputStream(fos); //시리얼라이즈 필요
		oos.writeObject(member);
		oos.flush();
		oos.close();
	}
	
	//파일 읽기
	public void loadFile() throws ClassNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("c:/temp/membership.db");
		ObjectInputStream ois = new ObjectInputStream(fis);
		member = (ArrayList<Account>) ois.readObject();	
		for (Account account : member) {
			System.out.println(account);
		}
		ois.close();

	}	
}
