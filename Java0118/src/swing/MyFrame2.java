package swing;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import org.w3c.dom.events.MouseEvent;

public class MyFrame2 extends JFrame implements ActionListener,MouseListener {

	int click=1;
	
	JButton jb1 = new JButton("버튼");
	JButton jb2 = new JButton("버튼2");

	public MyFrame2() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = this.getContentPane(); // 컴포넌트 붙이는 곳
		this.setVisible(true);
		this.setTitle("스윙~ 이벤트다~!");
		this.setSize(300, 300);
		this.setLocation(500, 300);

		
		con.addMouseListener(this);
		con.setLayout(new FlowLayout());
		con.add(jb1);
		jb1.addActionListener(this);
		con.add(jb2);
		jb2.addActionListener(this);
		

	}

	public static void main(String[] args) {
		new MyFrame2();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jb1) {
			System.out.println("버튼1");
			
		} else if (e.getSource() == jb2) {
			System.out.println("버튼2");
		} 
	}

	@Override
	public void mouseClicked(java.awt.event.MouseEvent e) {
		System.out.println(click+"번 클릭. "+e.getX()+", "+e.getY());
		click++;
	}

	@Override
	public void mousePressed(java.awt.event.MouseEvent e) {
	}

	@Override
	public void mouseReleased(java.awt.event.MouseEvent e) {
	}

	@Override
	public void mouseEntered(java.awt.event.MouseEvent e) {
	}

	@Override
	public void mouseExited(java.awt.event.MouseEvent e) {
	}
}
