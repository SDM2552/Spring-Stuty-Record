package clitest;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class Processor {

	private Scanner sc;
	private Connection conn;

	public Processor(Scanner sc, Connection conn) {
		this.sc = sc;
		this.conn = conn;
	}

//	Statement stmt = null;
//	ResultSet rs = null;

//========================== 데이터 보기 ========================================
	public void viewData() {

		String sql = "SELECT empno, ename, job, mgr, hiredate, sal, comm, deptno FROM firm.emp;";
		ArrayList<Emp> list = new ArrayList<>();

		try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql);) {
//			stmt=conn.createStatement();
//			rs=stmt.executeQuery(sql);
			while (rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				int mgr = rs.getInt("mgr");
				String hiredate = rs.getString("hiredate");
				double sal = rs.getDouble("sal");
				double comm = rs.getDouble("comm");
				int deptno = rs.getInt("deptno");

				list.add(new Emp(empno, ename, job, mgr, hiredate, sal, comm, deptno));
				for (Emp emp : list) {
					System.out.print(emp.getEmpno() + ", ");
					System.out.print(emp.getEname() + ", ");
					System.out.print(emp.getJob() + ", ");
					System.out.print(emp.getMgr() + ", ");
					System.out.print(emp.getHiredate() + ", ");
					System.out.print(emp.getSal() + ", ");
					System.out.print(emp.getComm() + ", ");
					System.out.println(emp.getDeptno() + ", ");
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

//========================== 데이터 입력 ========================================
	public void insertData() {
		try (Statement stmt = conn.createStatement();) { //try-with-resources
//			stmt=conn.createStatement();
			
			int empno;
			String ename;
			String job;
			int mgr;
			String hiredate;
			double sal;
			double comm;
			int deptno;
			
			System.out.print("empno 입력(숫자): ");
			empno = Integer.parseInt(sc.nextLine());
			System.out.print("ename 입력(문자): ");
			ename = sc.nextLine();
			System.out.print("job 입력(문자): ");
			job = sc.nextLine();
			System.out.print("mgr 입력(숫자): ");
			mgr = Integer.parseInt(sc.nextLine());
			while (true) {
				System.out.print("hiredate 입력(8자리 숫자): ");// <-꼭 8자리 숫자여야 됨!
				hiredate = sc.nextLine();
				if (hiredate.length() == 8) {
					break;
				} else
					System.out.println("제대로 입력하세요.");
			}
			System.out.print("sal 입력(숫자): ");
			sal = Double.parseDouble(sc.nextLine());
			System.out.print("comm 입력(숫자): ");
			comm = Double.parseDouble(sc.nextLine());
			System.out.print("deptno 입력(숫자): ");
			deptno = Integer.parseInt(sc.nextLine());
			String sql = "insert into emp values (" + empno + ", '" + ename + "','" + job + "'," + mgr + ", " + hiredate
					+ "," + sal + "," + comm + "," + deptno + ")";
			int result = stmt.executeUpdate(sql);
			if (result == 1) {
				System.out.println("입력 성공!");
			} else {
				System.out.println("입력 실패!");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

//========================== 데이터 삭제 ========================================
	public void deleteData() {
		try (Statement stmt = conn.createStatement();) {
			System.out.println("누구를 삭제하시겠습니까?");
			System.out.print("이름 입력> ");
			String ename = sc.nextLine();
			String sql = "delete from emp where ename = '" + ename + "'";
			int result = stmt.executeUpdate(sql);
			if (result >= 1) {
				System.out.println("삭제 성공!");
			} else {
				System.out.println("삭제 실패!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

//========================== 데이터 수정 ========================================	
	public void updateData() {
		try (Statement stmt = conn.createStatement();){
			System.out.println("누구의 정보를 변경하시겠습니까?");
			System.out.print("empno 입력> ");
			String searchEmpno = sc.nextLine();
			String sql = "select * from emp where empno = '"+searchEmpno+"';";
			
			try(ResultSet rs = stmt.executeQuery(sql);){ // ResultSet를 먼저 닫는다
				while (rs.next()) { //------------------ 선택한 레이어 출력 
					int empno = rs.getInt("empno");
					String ename = rs.getString("ename");
					String job = rs.getString("job");
					int mgr = rs.getInt("mgr");
					String hiredate = rs.getString("hiredate");
					double sal = rs.getDouble("sal");
					double comm = rs.getDouble("comm");
					int deptno = rs.getInt("deptno");
					System.out.println(empno+", "+ename+", "+job+", "+mgr+", "+hiredate+", "+sal+", "+comm+", "+deptno);
				}
				System.out.print("empno 수정: ");
				int empno = Integer.parseInt(sc.nextLine());
				System.out.print("ename 수정: ");
				String ename = sc.nextLine();
				System.out.print("job 수정: ");
				String job = sc.nextLine();
				System.out.print("mgr 수정: ");
				int mgr = Integer.parseInt(sc.nextLine());
				System.out.print("hiredate 수정: ");
				int hiredate = Integer.parseInt(sc.nextLine());
				System.out.print("sal 수정: ");
				double sal = Double.parseDouble(sc.nextLine());
				System.out.print("comm 수정: ");
				double comm = Double.parseDouble(sc.nextLine());
				System.out.print("deptno 수정: ");
				int deptno = Integer.parseInt(sc.nextLine());
				String updateSql ="update emp set ename='"+ename+"', job='"+job+"', mgr='"+mgr+"' ,hiredate='"+hiredate+"',sal='"+sal+"',comm='"+comm+"',deptno='"+deptno+"' where empno = '50';";
				int result = stmt.executeUpdate(updateSql);
				if (result >= 1) {
					System.out.println("수정 성공!");
				} else {
					System.out.println("수정 실패!");
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	

//========================== 끝 ========================================
}
