//package swing.ver1;
//
//import java.awt.Container;
//import java.awt.FlowLayout;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JTextField;
//
//public class MyFrame extends JFrame implements ActionListener{
//	
//	JButton jb1 = new JButton("예");
//	JButton jb2 = new JButton("아니오");
//	
//	JTextField jt1=new JTextField();
//	JTextField jt2=new JTextField();
//
//	
//	public MyFrame() {
//		Container con = this.getContentPane();
//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		this.setVisible(true);
//		this.setTitle("Hello swing");
//		this.setSize(300, 300);
//		this.setLocation(300, 300);
//		
//		con.setLayout(new FlowLayout());
//		
//		con.add(jb1);
//		jb1.addActionListener(this);
//		con.add(jb2);
//		jb2.addActionListener(this);
//		con.add(new JTextField(20));
//		con.add(new JTextField(20));
//	}
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		if(e.getSource()==jb1) {
//			System.out.println("예");
//		} else if (e.getSource()==jb2) {
//			System.out.println("아니오");
//		}		
//	}
//
//	public static void main(String[] args) {
//		new MyFrame();
//	}
//}
