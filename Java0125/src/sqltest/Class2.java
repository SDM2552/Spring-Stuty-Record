package sqltest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Class2 {

	void method() {
		String url = "jdbc:mysql://localhost:3306/firm";
		String id = "root";
		String pass = "mysql";
		String sql = "select * from emp";
//		Connection conn = null;
//		Statement stmt = null;
//		ResultSet rs = null;

		try (Connection conn = DriverManager.getConnection(url, id, pass);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql);) {

			while (rs.next()) {
				System.out.print(rs.getInt("empno") + "\t");
				System.out.print(rs.getString("ename") + "\t");
				System.out.println(rs.getDouble("sal"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

	public static void main(String[] ar) {
		Class2 cs2 = new Class2();
		cs2.method();
	}

}