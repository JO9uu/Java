package ch06.sec04;
/*
 * 날짜: 2024/01/05
 * 내용: Ch06 클래스 교재 정리
 * 클래스에는 두 가지의 용도가 있음
 * -라이브러리 클래스: 실행 할 수 없으며 다른 클래스에서 이용하는 클래스
 * -실행 클래스: main() 메소드를 가지고 실행 가능한 클래스./
 */
public class StudentExample {
	public static void main(String[] args) {
		
	Student s1 = new Student();
	System.out.println("s1 변수가 Student 객체를 참조합니다.");
	
	Student s2 = new Student();
	System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다");
	
	}

}
