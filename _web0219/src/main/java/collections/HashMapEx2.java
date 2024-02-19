package collections;

import java.util.HashMap;
import java.util.Scanner;

import dao.MemberDao;
import dto.Member;

public class HashMapEx2 {
	public static void main(String[] args) {
		MemberDao dao = MemberDao.getInstance();
		HashMap<String, Member> map = dao.selectMembers();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("아이디와 비밀번호를 입력하세요.");
			System.out.print("아이디: ");
			String id = sc.nextLine();
			System.out.print("비밀번호: ");
			String password = sc.nextLine();
			System.out.println();
			
			if(map.containsKey(id)) {
				if(map.get(id).getEmail().equals(password)) {
					System.out.println("로그인 되었습니다.");
					break;
				} else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
			} else {
				System.out.println("입력하신 아이디가 존재하지 않습니다.");
			} 
			
		}
	}
}
