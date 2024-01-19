package anonymous;

class AnyClass {
	void asd() {
	};
}

public class Ex {

	public static void main(String[] args) {

		AnyClass ac = new AnyClass() {
			@Override
			void asd() {
				super.asd();
			}
		};
	}

}
