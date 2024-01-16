package ch14.sec05.exam01;

/*
 * 날짜: 2024/01/15
 * 쪽수: P.604
 */

import java.awt.Toolkit;

public class SleepExample {
	public static void main(String[] args) {
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<10; i++) {
			toolkit.beep();
			try {
				Thread.sleep(3000);
			}catch(InterruptedException e) {
				
			}
		}
	}
}
