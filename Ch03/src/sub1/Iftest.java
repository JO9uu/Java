package sub1;

/*
 * 날짜: 2023/12/27
 * 이름: 엉구
 * 내용: Java 조건문 if 실습하기
 * 
 * 
 * 
 */


public class Iftest {

	public static void main(String[] args) {
		
		//if
		int num1 = 1;
		int num2 = 3;
		
		if(num1 < num2) {
			System.out.println("num1은 num2보다 작다.");
			//조건이 참이면 실행, 조건이 거짓이면 건너뜀
					
		}
		
		if(num1 > 0) {
			
			System.out.println("num1은 1보다 크다");
			
		if(num1 > 0) {
			
			if(num2 > 1) {
				
				System.out.println("num1은 0보다 크고 num2는 1보다 크다.");
				
			}
		}

		if(num1 > 0 && num2 > 1 ) {
			System.out.println("num1은 0보다 크고 num2는 보다 크다");
		}
		}
		
		//if~else
		
		int var1=1, var2 = 2;
		
		if(var1 > var2) {
			//조건이 참일 떄
			System.out.println("var1이 var2보다 크다.");
			
		}
		else {
			//조건이 거짓일 때
			System.out.println("var1이 var2보다 작다.");
		}
		
		//if~else if~else
		int n1 = 1, n2 = 2, n3 = 3, n4 = 4;
		
		if(n1 > n2) {
		//조건1
			System.out.println("n1이 n2보다 크다.");
		}	
		else if(n2 > n3) {
		//조건2
			System.out.println("n2가 n3보다 크다.");
		}	
		else if(n3 > n4) {
		//조건3
			System.out.println("n3이 n4보다 크다");
		}
		else{
		//조건4
			System.out.println("n4는 n1보다 크다");
		}}}
		
		
		
		
		
		