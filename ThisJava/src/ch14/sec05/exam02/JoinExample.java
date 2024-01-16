package ch14.sec05.exam02;
/*
 * 날짜: 2024/01/15
 * 쪽수: P.606
 */
public class JoinExample {
	public static void main(String[] args) {
		SumThread sumThread = new SumThread();
		sumThread.start();
		try {
			sumThread.join();
			
		}catch (InterruptedException e) {
			
		}
		System.out.println("1~100 합:" + sumThread.getSum());
	}
}
