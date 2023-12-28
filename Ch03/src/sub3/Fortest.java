package sub3;


/*
 * 날짜: 2023/12/27
 * 이름: 엉구
 * 내용: Java 조건문 Switch 실습하기
 * 
 */

public class Fortest {

	public static void main(String[] args) {
		
		//for
		
		for(int i=1; i<=5; i++) {
			
			System.out.println("1 : " + i);
		}
		
			
		
		//1부터 10까지 합을 구하라
			
			int sum = 0;
			
			for(int i=1; i<=10; i++) {
				
				sum= sum + i; 
				
				System.out.println("1부터 10까지의 합: " + sum);
				
				
				
		//for 중첩
				
				for(int a=1; a<=3; a++) {
					System.out.println("a : " + a);
					
					for(int b=1; b<=5; b++){
						
						System.out.println("b =  " + b);
					}
				}
			}
		
		
		//구구단
			
			for(int x=2; x<=9; x++) {
				
				
				System.out.println("구구구구 " + x + " 단");
				
				for(int y=1; y<=9; y++) {
					
					int z = x * y;
					
					System.out.println(x + "x" + y + "=" + (x*y)  );
					
				}
					
					
			}
				
		
		
		
	}
}
