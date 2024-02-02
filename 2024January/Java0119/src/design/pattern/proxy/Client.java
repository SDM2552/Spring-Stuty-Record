package design.pattern.proxy;

public class Client {

	public static void main(String[] args) {
//		ISubject sub = new RealSubject(); 원래 이렇게 하면 되는데
//		sub.action();
		
		ISubject sub = new Proxy(new RealSubject());
		sub.action();
	}

}
