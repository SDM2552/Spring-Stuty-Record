package swing.ver3;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyWin extends JFrame implements ActionListener{

	JLabel lb1 = new JLabel("이름1:");
	JTextField tf1 = new JTextField(5);
	JButton bt1 = new JButton("예");

	JLabel lb2 = new JLabel("이름2:");
	JTextField tf2 = new JTextField(5);
	JButton bt2 = new JButton("아니오");
	
	public MyWin() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setTitle("자바 스윙");
		this.setSize(400, 400);
		this.setLocation(500, 300);

		Container con = this.getContentPane();
		con.setLayout(new FlowLayout());
		con.add(lb1);
		con.add(tf1);
		con.add(bt1);
		con.add(lb2);
		con.add(tf2);
		con.add(bt2);
		
		bt1.addActionListener(this);
		bt2.addActionListener(this);

	}
	@Override
	public void actionPerformed(ActionEvent e) {
//		System.out.println("클릭");
		if(e.getSource().equals(bt1)) {
			System.out.println("예");
		} else if(e.getSource().equals(bt2)) {
			System.out.println("아니오");
		}
	}
	
	
	
	
	public static void main(String[] args) {
		new MyWin();
	}
}
