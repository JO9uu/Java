
package test1;
/*
 * 날짜: 2023/12/28
 * 이름: 정원구
 * 내용: 자바 반복문 연습문제
 */
public class Test8 {
public static void main(String[] args) {
	
	//직접 그려보면 편함
	
	int n = 5;
	
	for(int i = 0; i<5; i++){
		for(int j=n-1; j>i ; j--){
			System.out.print(" ");
		}
			for(int j=0; j<2*i+1 ; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	
}
	
}
