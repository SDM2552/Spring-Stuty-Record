package swing.ver7;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyWin extends JFrame {

	JLabel lb1 = new JLabel("이름1:");
	JTextField tf1 = new JTextField(5);
	JButton bt1 = new JButton("발사");

	JLabel lb2 = new JLabel("이름2:");
	JTextField tf2 = new JTextField(5);
	JButton bt2 = new JButton("종료");
	JLabel lbState = new JLabel("메세지를 보여줍니다.");
	JTextArea ta = new JTextArea(5,10);

	public MyWin() {
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.setVisible(true);
		this.setTitle("자바 스윙");
		this.setSize(700, 400);
		this.setLocation(500, 300);

		Container con = this.getContentPane();
		con.setLayout(new FlowLayout());
		con.add(lbState);
		con.add(lb1);
		con.add(tf1);
		con.add(bt1);
		con.add(lb2);
		con.add(tf2);
		con.add(bt2);
		JScrollPane scroll = new JScrollPane(ta);
//		scroll.setSize(30,20);
		con.add(scroll);
		
		bt1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("발사!");
				lbState.setText("버튼1을 클릭했습니다.");
			}
		});
		bt2.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				confirmExit();
			}
		});
		
		JOptionPane.showMessageDialog(this,"파일을 읽었습니다!","파일읽기",JOptionPane.PLAIN_MESSAGE);
	}

	public void confirmExit() {

		int answer = JOptionPane.showConfirmDialog(this,"종료하시겠습니까?", "confirm",JOptionPane.YES_NO_OPTION);
		if(answer==JOptionPane.YES_NO_OPTION) {
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);
		} else {
			System.out.println("종료를 취소합니다.");
			lbState.setText("종료를 취소했습니다.");

		}
	
	}
	
	public static void main(String[] args) {
		new MyWin();
	}
}
