package sec02.exam03;

public class HankookTire extends Tire {

	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
		
	}

	@Override
	public boolean roll() {
		++accumlatedRotation;
		if(accumlatedRotation<maxRotation) {
			System.out.println(location+" HaakookTire 수명: "+(maxRotation-accumlatedRotation)+"회");
			return true;
		} else {
			System.out.println("***" + location + " HankookTire 펑크 ***");
			return false;
		}
	}
	
	

	
}
