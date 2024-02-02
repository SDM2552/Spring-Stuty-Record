package swing;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyAction implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getSource());
	}
	
}

public class MyFrame extends JFrame {
	
	public MyFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = this.getContentPane(); // 컴포넌트 붙이는 곳
		this.setVisible(true);
		this.setTitle("스윙~ 이벤트다~!");
		this.setSize(300, 300);
		this.setLocation(500,300);
		
		con.setLayout(new FlowLayout());
		JButton jb = new JButton("버튼");
		con.add(jb);
		jb.addActionListener(new MyAction());
		JButton jb2=new JButton("버튼2");
		con.add(jb2);
		jb2.addActionListener(new MyAction());

	}

	public static void main(String[] args) {
		
		new MyFrame();
	}
}
