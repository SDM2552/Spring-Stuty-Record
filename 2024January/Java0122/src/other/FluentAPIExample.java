package other;

public class FluentAPIExample {

	public static class Builder {
		private String param1;
		private int param2;

		public Builder withParam(String value) {
			this.param1 = value;
			return this;
		}

		public Builder withParam2(int value) {
			this.param2 = value;
			return this;
		}

		public Product build() {
			return new Product(param1, param2);
		}
	}

	public static class Product {
		private String param1;
		private int param2;

		private Product(String param1, int param2) {
			this.param1 = param1;
			this.param2 = param2;
		}

		public void display() {
			System.out.println("Param1: " + param1);
			System.out.println("Param2: " + param2);
		}
	}

	public static void main(String[] args) {

		Builder builder = new Builder();
		builder.withParam("Hello").withParam2(42);
		Product product = builder.build();

		product.display();
	}

}
