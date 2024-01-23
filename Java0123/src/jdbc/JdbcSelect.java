package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

//DB 자료를 ArrayList에 넣을 수 있을까요?
public class JdbcSelect {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		ArrayList<Member> list = new ArrayList<>();
		
		String url = "jdbc:mysql://localhost:3306/firm";
		String id = "root";
		String pass = "mysql";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(url, id, pass);
		Statement stmt = conn.createStatement();
		String sql="select * from emp";
		
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()) {
			list.add(new Member(rs.getInt("empno"),rs.getString("ename"),rs.getDouble("sal")));
		}
		
		for(Member member :list) {
		System.out.println(member);
		}
		
	}
}

class Member{
	int empno;
	String ename;
	double sal;
	
	public Member(int empno, String ename, double sal) {
		this.empno = empno;
		this.ename = ename;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Member [empno=" + empno + ", ename=" + ename + ", sal=" + sal + "]";
	}
	
	
	
}