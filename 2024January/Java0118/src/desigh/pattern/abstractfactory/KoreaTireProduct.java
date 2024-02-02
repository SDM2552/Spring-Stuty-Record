package desigh.pattern.abstractfactory;

//국산 타이어 생산
public class KoreaTireProduct extends TirePrododuct{

	@Override
	public String makeAssemble() {
		return "국산 타이어";
	}

}
