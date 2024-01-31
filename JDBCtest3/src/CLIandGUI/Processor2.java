package CLIandGUI;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Processor2 implements CRUD{

	private Statement stmt;
	private JTextArea ta;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;
	private JTextField tf4;
	private JTextField tf5;
	private JTextField tf6;
	private JTextField tf7;
	private JTextField tf8;

	int empno;
	String ename;
	String job;
	int mgr;
	int hiredate;
	double sal;
	double comm;
	int deptno;

	public Processor2(Statement stmt, JTextArea ta, JTextField tf1, JTextField tf2, JTextField tf3,
			JTextField tf4, JTextField tf5, JTextField tf6, JTextField tf7, JTextField tf8) {
		super();
		this.stmt = stmt;
		this.ta = ta;
		this.tf1 = tf1;
		this.tf2 = tf2;
		this.tf3 = tf3;
		this.tf4 = tf4;
		this.tf5 = tf5;
		this.tf6 = tf6;
		this.tf7 = tf7;
		this.tf8 = tf8;
	}

//========================== 데이터 보기 ========================================
	@Override
	public void selectData() {
		String sql = "select * from emp";
		try (ResultSet rs = stmt.executeQuery(sql);) {
			ta.setText("");
			while (rs.next()) {
				empno = rs.getInt("empno");
				ename = rs.getString("ename");
				job = rs.getString("job");
				mgr = rs.getInt("mgr");
//				int hiredate=rs.getInt("hiredate"); //date 타입이라 문제있음
				java.sql.Date hiredate = rs.getDate("hiredate");
				String hiredateStr = hiredate.toString();
				sal = rs.getDouble("sal");
				comm = rs.getDouble("comm");
				deptno = rs.getInt("deptno");

				String str = String.format("%d, %s, %s, %d, %s, %,.2f %,.2f %d\n", empno, ename, job, mgr, hiredate, sal, comm,
						deptno);
				ta.append(str);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

//========================== 데이터 입력 ========================================
	@Override
	public void insertData() {
		String sql = String.format("insert into emp values(%s,'%s','%s',%s,%s,%s,%s,%s)", tf1.getText(), tf2.getText(),
				tf3.getText(), tf4.getText(), tf5.getText(), tf6.getText(), tf7.getText(), tf8.getText());
		try {
			int res = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

//========================== 이름 검색 ========================================
	public void search() {
		String sql = "select * from emp where ename = '" + tf2.getText() + "';";
		try (ResultSet rs = stmt.executeQuery(sql);) {
			ta.setText("");
			while (rs.next()) {
				empno = rs.getInt("empno");
				ename = rs.getString("ename");
				job = rs.getString("job");
				mgr = rs.getInt("mgr");
				java.sql.Date hiredate = rs.getDate("hiredate");
//				String hiredateStr = hiredate.toString();
				sal = rs.getDouble("sal");
				comm = rs.getDouble("comm");
				deptno = rs.getInt("deptno");
				String str = String.format("%d,%s,%s,%d,%s,%2f,%2f,%d\n", empno, ename, job, mgr, hiredate, sal, comm,
						deptno);
				ta.append(str);
				tf1.setText(String.valueOf(empno));
				tf2.setText(ename);
				tf3.setText(job);
				tf4.setText(String.valueOf(mgr));
				tf5.setText(String.valueOf(hiredate));
				tf6.setText(Double.toString(sal));
				tf7.setText(Double.toString(comm));
				tf8.setText(String.valueOf(deptno));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

//========================== 데이터 수정 ========================================
	@Override
	public void updateData() {
		String sql = "UPDATE emp SET empno=" + tf1.getText() + ", ename='" + tf2.getText() + "', job='" + tf3.getText()
				+ "', mgr=" + tf4.getText() + ", hiredate='" + tf5.getText() + "', sal=" + tf6.getText() + ", comm="
				+ tf7.getText() + ", deptno=" + tf8.getText() + " WHERE empno=" + empno;
		try {
			ta.setText("");
			int rs = stmt.executeUpdate(sql);
			search();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
//========================== 데이터 삭제 ========================================
	@Override
	public void deleteData() {

		String sql = "delete from emp where empno = '" + tf1.getText() + "';";
		try {
			ta.setText("삭제를 완료했습니다.");
			int rs = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
//=끝=
}