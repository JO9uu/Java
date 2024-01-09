package ch05;
//p. 158

import java.util.Scanner;

public class Sec06 {
public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("주민등록 번호 : " );
	
	String ssn = sc.next();
		
	char sex = ssn.charAt(6);
	switch (sex) {
	case '1':
	case '3':
System.out.println("성별 : 남자 ");
break;
	case '2':
	case '4':
	System.out.println("성별 : 여자 ");
		break;
	}

	
	int length = ssn.length();

	if(length == 13) {
		System.out.println("주민등록번호 자릿수가 맞습니다");
				 
	}else {
		System.out.println("주민등록번호 자릿수가 틀립니다");
	}

}
	
	
}
