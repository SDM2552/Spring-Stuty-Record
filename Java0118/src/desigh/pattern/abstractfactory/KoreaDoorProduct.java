package desigh.pattern.abstractfactory;

//국산 문짝 생산
public class KoreaDoorProduct extends DoorProduct{

	@Override
	public String makeAssemble() {
		return "문이 열립니다.";
	}

	
}
