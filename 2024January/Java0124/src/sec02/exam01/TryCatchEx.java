package sec02.exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TryCatchEx {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("예외 발생: ");
			e.printStackTrace();
		} finally {
			System.out.println("반드시 실행");
		}

		try {
			Connection con = DriverManager.getConnection(null);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
