package page417;

import java.util.Scanner;

public class ButtonMain {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Button btn = new Button();
		Button.OnClickListener listener = null;
		System.out.print("1,2선택: ");
		String str=sc.nextLine();
		
		switch(str) {
		
		case "1":
		listener=new CallLisetener();
		break;
		
		case "2":
		listener=new MessangeListener();
		break;
		}
		btn.setOnClickListener(listener);
		btn.touch();
	}

}
