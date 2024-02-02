package desigh.pattern.abstractfactory;

//미국산 문짝 생산
public class StateDoorProduct extends DoorProduct{

	@Override
	public String makeAssemble() {
		return "Door is open.";
	}

}
