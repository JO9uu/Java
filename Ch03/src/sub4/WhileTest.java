package sub4;
/*
 * 날짜: 2023/12/28
 * 이름: 엉구
 * 내용: 조건문 while 실습하기
 * 
 * 
 * 
 */
public class WhileTest {
public static void main(String[] args) {
	
	//do-while
	
	int esum = 0;
	int i = 1;
	
	do {
		if(i%2 == 0)
			esum += i;
		i++;
		
	}
	while(i<=10);{
		
	}
	System.out.println("1부터 10까지의 짝수 합 : " + esum);
	
	
	//1부터 10까지의 홀수 합
	int tot = 0;
	int j = 1;
	
	while(j<=10) {
		
		if(j%2==1) {
			
			tot += j;
					
		}
		j++;
	}
	System.out.println("1부터 10까지의 홀수 합 : " + tot);
	
	//break 
	int num = 1;
	while(true) {
		if (num % 5 == 0 && num % 7 == 0 ) {
			break; //반복문 종료
			
		}
		num++;
		
	}
	System.out.println("5와 7의 최수공배수 " + num);
	
	//continue
	
	int total = 0; 
	int n = 1;
	
	while(n <= 10) {
		
		n++;
		
		if(n % 2 == 1) {
			continue; //반복문 처음으로 이동
			
		}
		
		total += n;
		
	}
	
	System.out.println("1부터 10까지 짝수합 : " + total);
	
}
}
