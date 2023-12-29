package test2;
import java.util.Scanner;
/*
 * 날짜: 2023/12/29
 * 이름: 정원구
 * 내용: 자바 메서드 연습문제
 */
public class Test6 {

	public static void intro() {
		System.out.println("******* START *******");
		System.out.println("두개의 정수를 입력");
	}
	
	public static int input() (Scanner sc. String name){
		System.out.print("변수" + name + "값 입력 : ");
		int input = sc.nextInt();
		return input;
	}
	
	public static void result(int va1) {
		System.out.println("덧셈 결과 : " + va1);
		System.out.println("******* END *******");
	}
	//리턴값 o>int 
	public static int add(int x, int y) {
		return x + y;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		intro();
		
		
		int a = input(sc. "a");
		int b = input(sc. "b");
		
		int output = add(a, b);
		result(output);
		
		sc.close();
				
		
	}	

}

