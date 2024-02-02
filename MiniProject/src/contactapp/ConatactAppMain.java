package contactapp;

import java.io.IOException;
import java.util.Scanner;

public class ConatactAppMain {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Scanner sc = new Scanner(System.in);
		TaskProcessor2 taskProcessor2 = new TaskProcessor2();
		Contact contact = new Contact(sc,taskProcessor2);		
		
		contact.run();
	}

}
