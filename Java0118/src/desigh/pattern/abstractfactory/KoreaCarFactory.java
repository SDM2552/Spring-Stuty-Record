package desigh.pattern.abstractfactory;

//국산차 생산 공장
public class KoreaCarFactory extends CarFactory{

	@Override
	public TirePrododuct createTire() {
		return new KoreaTireProduct();
	}

	@Override
	public DoorProduct createDoor() {
		return new KoreaDoorProduct();
	}

	
}
