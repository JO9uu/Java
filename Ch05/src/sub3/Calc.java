package sub3;
/*
 * 
 * 날짜: 2024/01/02
 * 이름: 정원구
 * 내용: 클래스 변수, 클래스 메서드 실습하기
 *
 */

public class Calc {
	
	// 싱글톤 객체 생성 instance(일반적 싱글톤 이름), 싱글톤은 예외적으로 private 사용
	private static Calc instance = new Calc();
	public static Calc getInstance() {
		return instance;
	}
	
	private Calc() {}

	public int plus(int x, int y) {
		return x  + y;
	}
	public int minus(int x, int y) {
		return x  - y;
	}
	public int multi(int x, int y) {
		return x  * y;
	}
	public int div(int x, int y) {
		return x  / y;
	}
}
