package ch14.sec03.exam03;
/*
 * 날짜: 2024/01/15 
 * 쪽수: P. 600
 */

import java.awt.Toolkit;

public class BeepPrintExample {

	public static void main(String[] args) {
		Thread thread = new Thread() {
			@Override
			public void run () {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0; i<5; i++) {
					toolkit.beep();
					try {Thread.sleep(500);}catch(Exception e) {}
					
				}
			}
		};
	thread.start();
	for (int i=0; i<5; i++) {
		System.out.println("띵");
		try {Thread.sleep(500);}catch(Exception e) {}
		
	}
	}
}
