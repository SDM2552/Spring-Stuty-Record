package drive;

import dao.MemberDao;
import dto.Member;

public class MemberDaoEx {
	public static void main(String[] args) {
		MemberDao dao = MemberDao.getInstance();
		Member member =dao.select("admin");
		System.out.println(member);
		System.out.println(MemberDao.getInstance().select("admin"));
		
//		Member member2 = dao.selectForLogin("asd", "1234");
//		System.out.println(member2);
		
//		Member member3 = new Member("test2", "test2@korea.com", "테스트2");
//		dao.insert(member3);
		
		Member member4 = new Member("test2", "test4@korea.com", "테스트4");
		dao.update(member4);
		System.out.println(member4);
	}
}
