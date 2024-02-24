package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dto.Member;
import encript.BCrypt;

public class MemberDao {
	private static Connection conn;
	private static MemberDao dao = new MemberDao();
	private MemberDao() {	}
	PreparedStatement pstmt;
	ResultSet rs;

	public static MemberDao getInstance() {
		MemberDao.getConnection();
		return dao;
	}

	public static void getConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Member selectForLogin(String id, String pw) { //로그인용
		Member member=null;
		String sql = "select * from smember where id=?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				if(BCrypt.checkpw(pw, rs.getString("pw"))) {
				member = new Member(rs.getInt("numId"), rs.getString("id"), rs.getString("pw"), rs.getString("name"));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return member;	
	}
	
	public Member select(int numId) { //회원 정보 수정을 위한 값 가져오기
		Member member = null;
		String sql = "select * from smember where numid = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, numId);
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				member = new Member(rs.getInt("numId"), rs.getString("id"), rs.getString("pw"),
						            rs.getString("name"));
				System.out.println("select()의 member에 저장된 값: "+rs.getInt("numId")+ rs.getString("id")+ rs.getString("pw")+
			            rs.getString("name")); //디버그용
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return member;		
	}
	
	public int insert(Member member) { //회원가입
		String sql = "insert into smember(numId, id, pw, name) values (sql_smember.nextval,?,?,?)";
	    try ( 
	        PreparedStatement pstmt = conn.prepareStatement(sql);            
	    ) {
	        // 쿼리 실행
	    	pstmt.setString(1, member.getId());
	    	pstmt.setString(2, BCrypt.hashpw(member.getPw(), BCrypt.gensalt(10))); //BCrypt.hashpw(member.getPw(), BCrypt.gensalt(10))
	    	String hashedPassword = BCrypt.hashpw(member.getPw(), BCrypt.gensalt(10));
	    	System.out.println("암호화 후: " + hashedPassword);
	    	pstmt.setString(3, member.getName());
	        return pstmt.executeUpdate();
	    
	    } catch(Exception e) {
	        e.printStackTrace();
	    } 
		return 0;
	}
	
	public boolean isValidMember(Member member) { //공백 가입 방지용
		return member != null && !member.getId().trim().isEmpty() 
				&& !member.getPw().trim().isEmpty() 
				&& !member.getName().trim().isEmpty();
	}
	
	public int update(Member member) { //회원 정보 수정
		String sql = "update smember set name=? where id=?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getName());
			pstmt.setString(2, member.getId());
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return 0;
	}
	
}
