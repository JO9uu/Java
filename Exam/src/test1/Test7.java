
package test1;
/*
 * 날짜: 2023/12/28
 * 이름: 정원구
 * 내용: 1~10까지 정수 중 2의 배수와 3의 배수 정수의 합 구하기
 * 
 */

public class Test7 {
public static void main(String[] args) {
	int total = 0;
	
	for(int k=1 ; k<=10; k++) {
		if(k%2==0 || k%3==0) { //||연산자 중복 되는 값을 더하지 않기 위해 사용하는 연산자
	total += k;
	
		
		}		
	}
System.out.println("1~10까지 2의 배수와 3의 배수의 정수 합 : " + total);

}

}
