
package test1;
/*
 * 날짜: 2023/12/28
 * 이름: 정원구
 * 내용: 자바 연산자 연습문제
 */
public class Test3 {
public static void main(String[] args) {
	
	int num=0; 
	int result = num;	
	num=1;
	
	
	result = num++;
	System.out.println("result : " + result);
	
	result = ++num;
	System.out.println("result : " +result);
	
	result = num--;
	System.out.println("result : " + result);
	
	result = --num;
	System.out.println("result : " + result);
			
}
}
