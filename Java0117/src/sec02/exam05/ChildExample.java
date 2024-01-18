package sec02.exam05;

public class ChildExample {

	public static void main(String[] args) {

		Parent parent = new Child();
		parent.field1 = "data1";
		parent.methid1();
		parent.method2();
		
//		parent.field2="data2";
//		parent.method3();
		
		Child child = (Child) parent; //문법상 오류 없지만 nullpointerexception 가능성
		child.field2 = "yyy";
		child.method3();
		

	}

}
