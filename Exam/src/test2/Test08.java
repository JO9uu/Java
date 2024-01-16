package test2;
/*
 * 날짜: 2023/12/29
 * 이름: 정원구
 * 내용: 자바 배열 문자 출력 연습문제
 */
public class Test08 {

	public static void main(String[] args) {
	
	System.out.println("3! = " + factoral(3));
	System.out.println("4! = " + factoral(4));
	System.out.println("5! = " + factoral(5));
   
	}
	
	public static int factoral(int n) {
		if (n <= 1 ) {
			return 1;
		}
		
		return n * factoral(n-1);
}
}
