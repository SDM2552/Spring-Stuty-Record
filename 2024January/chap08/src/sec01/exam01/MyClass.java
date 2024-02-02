package sec01.exam01;

import java.rmi.Remote;

public class MyClass {

	RemoteControl rc= new Television();
	
	MyClass(RemoteControl rc){
		this.rc=rc;
	}
	
	void methodA() {
		RemoteControl rc=new Audio();
	}
}
