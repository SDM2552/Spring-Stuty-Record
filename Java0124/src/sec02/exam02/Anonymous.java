package sec02.exam02;

public class Anonymous {

	RemoteControl field = new RemoteControl() {
		
		
		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다.");
		}
		
		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다.");
		}
	};
	
	void method1() {
		RemoteControl localVal = new RemoteControl() {
			
			@Override
			public void turnOn() {
			System.out.println("Audio를 켭니다.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("Audio를 끕니다.");
			}
		};
		localVal.turnOn();
	}

	void method2(RemoteControl rc) {
		rc.turnOn();
	}
}
