
package test1;

import java.util.Scanner;

/*
 * 날짜: 2023/12/28
 * 이름: 정원구
 * 내용: 자바 기본 입출력 연습문제
 */
public class Test2 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int year;
	int birth;
	String name;
	
	System.out.print("올해 년도 입력 : " );
	year = sc.nextInt();	//숫자로 받아야해서 int
	
	System.out.print("태어난 년도 입력 : " );
	birth = sc.nextInt();
		
	System.out.print("이름 입력 : " );
	name = sc.next(); //이름은 문자열
		
	int age = year - birth;
	
	System.out.printf("%s님 안녕하세요. \n당신은 올해 만 %d세 입니다. ",name ,age);
	//서식문자에서 %s는 문자열, \n은 개행, %d는 숫자 
	
	
	
	
}
}
