package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;


public class SimpleMenu {

	private static final String DB_URL = "jdbc:mysql://localhost:3306/firm";
	private static final String DB_USER = "root";
	private static final String DB_PASSWORD = "mysql";
	static Scanner sc = new Scanner(System.in);
	
	Statement stmt = null;
	ResultSet rs = null;

	  public static void main(String[] args) {
	        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
	            boolean exit = false;

			while (!exit) {
				System.out.println("1. 데이터 보기");
				System.out.println("2. 데이터 삽입");
				System.out.println("3. 종료");
				System.out.print("선택하세요: ");

				int choice = Integer.parseInt(sc.nextLine());

				switch (choice) {
				case 1:
					viewData(conn);
					break;
				case 2:
					insertData(conn);
					break;
				case 3:
					exit = true;
					break;
				default:
					System.out.println("유효하지 않은 선택. 다시 시도하세요.");
					break;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
//====================== 데이터 보기 ===========================
	private static void viewData(Connection conn) {
		
		ArrayList<Dept> list = new ArrayList<>();
		
		Statement stmt = null;
		ResultSet rs = null;
		String sql="select deptno, dname, loc from dept";

		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int deptno=rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				list.add(new Dept(deptno, dname, loc));
			}
			for(Dept dept:list) {
				System.out.println(dept.getDeptno()+", "+dept.getDname()+", "+dept.getLoc());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

//====================== 데이터 삽입 ===========================
	private static void insertData(Connection conn) {
		Statement stmt = null;
		ResultSet rs = null;
		String url = "jdbc:mysql://localhost:3306/firm";
		String id = "root";
		String pass = "mysql";
		try {
			stmt = conn.createStatement();
//			conn = DriverManager.getConnection(url, id, pass);
			
			System.out.print("deptno 입력: ");
			String inDeptno=sc.nextLine();
			System.out.print("dname 입력: ");
			String inDname=sc.nextLine();
			System.out.print("loc 입력: ");
			String inIoc=sc.nextLine();
			String sql="insert into dept"+" values('"+inDeptno+"', '"+inDname+"', '"+inIoc+"')";
			int result = stmt.executeUpdate(sql);
			if (result == 1) {
				System.out.println(inDeptno+"', '"+inDname+"', '"+inIoc+" 입력성공!");
			} else {
				System.out.println("입력실패!");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
//====================== Dept class ===========================
class Dept {
	private int deptno;
	private String dname;
	private String loc;
	
	public Dept(int deptno, String dname, String loc) {
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}

	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
}