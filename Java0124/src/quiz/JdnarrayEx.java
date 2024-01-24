package quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

class Emp{
	private int empno;
	private String ename;
	private String sal;
	
	public Emp(int empno, String ename, String sal) {
		this.empno = empno;
		this.ename = ename;
		this.sal = sal;
	}

	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getSal() {
		return sal;
	}
	public void setSal(String sal) {
		this.sal = sal;
	}
	
}



public class JdnarrayEx {

	public static void main(String[] args) {

		ArrayList<Emp> list = new ArrayList<>();
		
		String url = "jdbc:mysql://localhost:3306/firm";
		String id = "root";
		String pass = "mysql";
		Connection conn = null;
		Statement stmt = null;
		String sql = "select empno, ename, sal from emp";
		ResultSet rs = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, id, pass);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String sal = rs.getString("sal");
//				String str=deptno+", "+dname+", "+loc;
				Emp emp = new Emp(empno, ename, sal);
				list.add(emp);
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
//		for(Emp emp : list) {
//			System.out.println(emp);
//		}
		for(Emp emp:list) {
			System.out.print(emp.getEmpno()+", ");
			System.out.print(emp.getEname()+", ");
			System.out.println(emp.getSal());
		}
	}
}
