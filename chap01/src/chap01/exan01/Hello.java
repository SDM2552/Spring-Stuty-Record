package chap01.exan01;

import java.io.IOException;

public class Hello {

	public static void main(String[] args) throws IOException {
		
		int keyCode;
		keyCode = System.in.read();
		System.out.println("keyCode: "+keyCode);
		keyCode = System.in.read();
		System.out.println("keyCode: "+keyCode);
		keyCode = System.in.read();
		System.out.println("keyCode: "+keyCode);
		keyCode = System.in.read();
		System.out.println("keyCode: "+keyCode);
		
	}

}
