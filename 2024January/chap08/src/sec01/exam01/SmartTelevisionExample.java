package sec01.exam01;

import java.rmi.Remote;

public class SmartTelevisionExample {

	public static void main(String[] args) {

		SmartTelevision tv = new SmartTelevision();
		
		RemoteControl rc=tv;
		Searchable searchable = tv;
	}

}
