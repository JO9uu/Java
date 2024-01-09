package sub2;
/*
 * 날짜 : 2024/01/08
 * 이름 : 정원구
 * 내용 : Java 예외처리 실습하기
 */

import java.util.Scanner;

public class ThrowsTest {

	public static void main(String[] args) {
	
		try {
		method1(10);
		}catch (Exception e) {
			e.printStackTrace();
		
		}
		System.out.println("프로그램 정상 종료...");
		
    }
	
	public static void method1(int n1) throws Exception {
		method2(n1);
	}
	public static void method2(int n2) throws Exception { // 아래 두 예외를 Exception으로 통일
	
	Scanner sc = new Scanner(System.in);

	System.out.println("숫자입력 : ");
	
	int input = sc.nextInt(); // InputMismatchException 발생 가능
	
	int result = n2/input; // ArithmeticException 발생 가능
	
	System.out.println("result : " + result);
	

	}
	
}
