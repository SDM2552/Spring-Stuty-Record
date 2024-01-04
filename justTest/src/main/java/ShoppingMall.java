import java.util.Scanner;

public class ShoppingMall {

	public static void main(String[] args) {
		Shopping user = new Shopping();
		Scanner sc= new Scanner(System.in);
		
		
	}
		
}
	
class Shopping {
		
		private String orderNumber = "202102130356";
		private String id = "peemang123";
		private String date = "20210213";
		private String name = "피망";
		private String productNumber = "PD-0345-120";
		private String adress = "서울시 관악구 123-456";
		
		public void orderPinrt() {
			System.out.println("주문 번호: "+orderNumber);
			System.out.println("주문자 ID: "+id);
			System.out.println("주문 날짜: "+date);
			System.out.println("주문자 이름: "+name);
			System.out.println("주문 상품 정보: "+productNumber);
			System.out.println("배송 주소: "+adress);
		}
		
		public void setOrderNumber(String orderNumber) {
			this.orderNumber=orderNumber;
		}
		public void setAdress(String adress) {
			this.adress=adress;
		}
		public void setDate(String date) {
			this.date=date;
		}
		public void setId(String id) {
			this.id=id;
		}
		public void setProductNumber(String productNumber) {
			this.productNumber=productNumber;
		}
}











