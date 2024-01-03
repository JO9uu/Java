package sub6;

/*
 * 날짜: 2024/01/03
 * 이름: 정원구
 * 내용: Java 다형성 실습하기
 */

public class PolyTest {

	public static void main(String[] args) {
		
		//참조 변수의 타입을 부모 타입으로 함, 업캐스팅으로 다형성 구현
		
		Animal t = new Tiger();
		t.move();
		t.hunt();
	    
		System.out.println();	
		
	    Animal e = new Eagle();
		e.move();
		e.hunt();
		
		System.out.println();
		
		Animal s = new Shark();
		s.move();
		s.hunt();
		
		System.out.println();
		
		//객체 타입 비교연산
		if(t instanceof Tiger) {
			
			System.out.println("t는 호랑이 입니다.");
		}
		if(e instanceof Eagle) {
			
			System.out.println("e는 독수리 입니다.");
		}
		if(s instanceof Shark) {
					
			System.out.println("s는 상어 입니다.");
		}
		
		
	}
	
	
}
