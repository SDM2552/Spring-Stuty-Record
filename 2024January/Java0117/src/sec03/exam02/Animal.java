package sec03.exam02;

public abstract class Animal {

	public String kind;
	
	public void breath() {
		System.out.println("숨을 쉰다.");
	}
	public abstract void sound();
}
