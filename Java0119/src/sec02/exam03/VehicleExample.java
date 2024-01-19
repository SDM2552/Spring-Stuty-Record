package sec02.exam03;

import java.util.ArrayList;
import java.util.List;

class Acc {

}

public class VehicleExample {

	public static void main(String[] args) {
		new Bus().checkFare();
		
		Vehicle vehicle = new Bus();
		vehicle.run();
//		vehicle.checkFare();
		Bus bus=(Bus) vehicle;
		bus.checkFare();
		
		String str="테스트";
		String str1="";
		for(int i=0;i<100;i++) {
			str1+=str;
		}
		List<Acc> list = new ArrayList<>();
//		list.add(123);
//		list.add("String");
//		list.add(3.14);
		list.add(new Acc());

		for (Object obj : list) {
			Acc acc = (Acc) obj;
			System.out.println(obj);
		}


	}

}
