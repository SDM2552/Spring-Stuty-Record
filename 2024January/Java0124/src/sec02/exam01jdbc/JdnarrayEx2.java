package sec02.exam01jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class JdnarrayEx2 {

	public static void main(String[] args) {

		ArrayList<List2> list = new ArrayList<>();
		
		String url = "jdbc:mysql://localhost:3306/firm";
		String id = "root";
		String pass = "mysql";
		Connection conn = null;
		Statement stmt = null;
		String sql = "select deptno, dname, loc from dept";
		ResultSet rs = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, id, pass);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				list.add(new List2(rs.getInt("deptno"),rs.getString("dname"),rs.getString("loc")));
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		for(List2 member :list) {
			System.out.println(member);
		}

	}

}

class List2{
	int deptno;
	String dname;
	String loc;
	
	public List2(int deptno, String dname, String loc) {
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}
	@Override
	public String toString() {
		return "List [deptno=" + deptno + ", ename=" + dname + ", sal=" + loc + "]";
	}
}