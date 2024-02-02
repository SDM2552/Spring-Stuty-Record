package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUpdate {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		String url = "jdbc:mysql://localhost:3306/firm";
		String id = "root";
		String pass = "mysql";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(url, id, pass);
		Statement stmt = conn.createStatement();
		String sql="update emp set sal =7000 where job='salesman'";
		int result = stmt.executeUpdate(sql);
		if (result>=1) {
			System.out.println("수정 성공."+result);
		} else {
			System.out.println("수정 실패..."+result);
		}
	}

}
