package sub1;
/*
 * 날짜: 2024/01/09
 * 이름: 정원구
 * 내용: Object 클래스 실습하기
 */
public class ObjectTest {
	
	public static void main(String[] args) {
		
		Object a1 = new Apple("한국", 3000); //Object 타입으로 업캐스팅 가능
		Object a2 = new Apple("일본", 2000);
		
		//임시적으로 호출되는 toString
		System.out.println(a1);
		System.out.println(a2);
		
		
		//객체 비교
		if(a1 == a2) { //두 객체의 주소값(Stack) 비교
			System.out.println("a1, a2 주소가 같다.");
		}else {
			System.out.println("a1, a2 주소가 다르다.");
	    }
		//갱장히 중요 갱갱갱장히 중요오오오오오오 
		//equals 는 Heap의 값을 비교
		if(a1.equals(a2)){
			System.out.println("a1, a2 객체가 같다.");
		}else {
			System.out.println("a1, a2 객체가 다르다.");
		}
	
	}
	
}
