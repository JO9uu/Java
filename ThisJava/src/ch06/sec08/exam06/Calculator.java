package ch06.sec08.exam06;
//p. 230~
public class Calculator {
	
	
	//리턴값이 없는 메소드 선언
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	//리턴값이 없는 메소드 선언
	void powerOff() {
		System.out.println("전원을 끕니다");
	}
	//호출시 두 정수 값을 전달받고,
	//호출한 곳으로 결과값 double을 리턴하는 메소드 선언
	
	int plus(int x, int y) {
		
		int result1 = x+y;
		return result1;
		
		
			}
	
	
	double divide (int x, int y) {
		double result = x / y;
		return result;
	}
}
