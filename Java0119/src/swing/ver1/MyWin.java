package swing.ver1;

import java.awt.Container;

import javax.swing.JFrame;

public class MyWin extends JFrame {

	public MyWin() {
		Container con = this.getContentPane();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setTitle("자바 스윙");
		this.setSize(400,400);
		this.setLocation(500,300);
		
	}
	
	
	
	public static void main(String[] args) {
		new MyWin();
	}
}
