package sec01.exam01;

import java.awt.Toolkit;

public class BeepPrintEx {
	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			System.out.println("삡!");
			try {
				toolkit.beep();
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
		for (int i = 0; i < 5; i++) {
			System.out.println("띵!!");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
	}
}
