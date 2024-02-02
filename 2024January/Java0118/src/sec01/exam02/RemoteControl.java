package sec01.exam02;

public interface RemoteControl {

	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 10; //수식어 많이 안붙여도 됨
	
	public abstract void turnOn();
	public void turnOff();
	void SetVolume(int volume);
	
}
