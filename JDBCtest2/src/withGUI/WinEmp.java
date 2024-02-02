package withGUI;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class WinEmp extends JFrame {

	JTextField tf1 = new JTextField(5);
	JTextField tf2 = new JTextField(5);
	JTextField tf3 = new JTextField(5);
	JTextField tf4 = new JTextField(5);
	JTextField tf5 = new JTextField(5);
	JTextField tf6 = new JTextField(5);
	JTextField tf7 = new JTextField(5);
	JTextField tf8 = new JTextField(5);

	JButton bt1 = new JButton("전체 내용");
	JButton bt2 = new JButton("입력");
	JButton bt3 = new JButton("이름 검색");
	JButton bt4 = new JButton("수정");
	JButton bt5 = new JButton("삭제");
	JTextArea ta = new JTextArea(17, 40);
	Connection conn;
	Statement stmt;
	private Processor2 processor;

	public WinEmp() {
		String url = "jdbc:mysql://localhost:3306/firm";
		String id = "root";
		String pass = "mysql";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, id, pass);
			stmt = conn.createStatement();
			processor = new Processor2(stmt, conn, ta, tf1, tf2, tf3, tf4, tf5, tf6, tf7, tf8);

		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}

		JLabel lb1 = new JLabel("   empno:");
		JLabel lb2 = new JLabel("  ename:");
		JLabel lb3 = new JLabel("     job:");
		JLabel lb4 = new JLabel("     mgr:");
		JLabel lb5 = new JLabel("  hiredate:");
		JLabel lb6 = new JLabel("     sal:");
		JLabel lb7 = new JLabel("   comm:");
		JLabel lb8 = new JLabel(" deptno:");

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = this.getContentPane();
		con.setLayout(new BorderLayout());
		JPanel jp1 = new JPanel(new FlowLayout());
		jp1.add(bt1);
		jp1.add(bt2);
		jp1.add(bt3);
		jp1.add(bt4);
		jp1.add(bt5);
		con.add(jp1, BorderLayout.SOUTH);
		JScrollPane scroll = new JScrollPane(ta);
		JPanel jp2 = new JPanel(new FlowLayout());
		jp2.add(scroll);
		con.add(jp2, BorderLayout.CENTER);

		JPanel jp3 = new JPanel(new GridLayout(2, 4));
		con.add(jp3, BorderLayout.NORTH);
		jp3.add(lb1);// 1
		jp3.add(tf1);
		jp3.add(lb2);// 2
		jp3.add(tf2);
		jp3.add(lb3);// 3
		jp3.add(tf3);
		jp3.add(lb4);// 4
		jp3.add(tf4);
		jp3.add(lb5);// 5
		jp3.add(tf5);
		jp3.add(lb6);// 6
		jp3.add(tf6);
		jp3.add(lb7);// 7
		jp3.add(tf7);
		jp3.add(lb8);// 8
		jp3.add(tf8);

		this.setLocation(500, 400);
		this.setSize(500, 400);
		this.setVisible(true);

		bt1.addActionListener(new ActionListener() { // 버튼1 전체 내용

			@Override
			public void actionPerformed(ActionEvent e) {
				processor.select();
				clearTextField();
			}
		});
		bt2.addActionListener(new ActionListener() { // 버튼2 입력
			@Override
			public void actionPerformed(ActionEvent e) {
				processor.insert();
				clearTextField();
				processor.select();
			}
		});
		bt3.addActionListener(new ActionListener() { // 버튼3 검색
			@Override
			public void actionPerformed(ActionEvent e) {
				processor.search();
			}
		});
		bt4.addActionListener(new ActionListener() { // 버튼4 수정

			@Override
			public void actionPerformed(ActionEvent e) {
				processor.update();
			}
		});
		bt5.addActionListener(new ActionListener() { // 버튼4 수정

			@Override
			public void actionPerformed(ActionEvent e) {
				processor.delete();
			}
		});
	}

	private void clearTextField() {
		tf1.setText("");
		tf2.setText("");
		tf3.setText("");
		tf4.setText("");
		tf5.setText("");
		tf6.setText("");
		tf7.setText("");
		tf8.setText("");

	}


	public static void main(String[] args) {
		new WinEmp();
	}
}