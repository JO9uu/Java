package sub1;

public class Variable {
	/*
	 * 날짜: 2023/12/26
	 * 이름: 엉구
	 * 내용: Ch02. Java 변수와 연산자
	 * 변수:(Variable)
	 * - 데이터 처리를 위한 데이터 그릇(임시저장소)
	 * - 변수는 메모리 공간이며 각 데이터는 종류에 따라 크기가 다름
	 * 
	 * 상수:(Constant)
	 * - 최초 초기화 되는 데이터로 고정된 변수
	 * - 
	 * - 
	 * 
	 */
	public static void main(String[] args) {
    
		//변수
		int a = 3;
		int b = 7;
		String c = "홍길동";
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
		
		//변수를 더 생성 할 수 없어 초기화
		
		a = 5;
		System.out.println("a : " + a);
				
		//상수(대문자 표기가 원칙)
		final int NUM = 5;
		
		// 변수를 덮어씌워 출력값은 7이 됨, final을 대입하면 초기화 x 상수는 값 대입 금지
		System.out.println("NUM : " + NUM);
		
		
	
		
		
	}
}
