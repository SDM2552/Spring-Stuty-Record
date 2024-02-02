package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcInsert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		String url = "jdbc:mysql://localhost:3306/firm";
		String id = "root";
		String pass = "mysql";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(url, id, pass);
		Statement stmt = conn.createStatement();
		String sql="insert into emp values('7777', '정몽주','사원',6073,'2024-01-23', 100, null,'0')";
		int result = stmt.executeUpdate(sql);
		if (result==1) {
			System.out.println("입력 성공."+result);
		} else {
			System.out.println("입력 실패..."+result);
		}
	}

}
