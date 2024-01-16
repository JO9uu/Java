package test3;
/*
 * 날짜: 2024/01/04
 * 이름: 정원구
 * 내용: 정적변수 연습문제
 */

class Student{
	//private일 경우 Test04에서 참조x 따라서 public으로 바꿔야 함.
	//속성
	protected static int studentId;
	private String studentName;
	private String major;
	private int grade;
	//생성자
	public Student(String studentName, String major, int grade) {
		this.studentId++; //증가 연산자이므로 숫자일 것임을 유추 가능
		this.studentName = studentName;
		this.major = major;
		this.grade = grade;
	}
	
	public void studentInfo() {
		System.out.println("=====================");
		System.out.println("학번 : " + studentId);
		System.out.println("이름 : " + studentName);
		System.out.println("전공 : " + major);
		System.out.println("학년 : " + grade);
		System.out.println("---------------------");
	}
}

public class Test04 {
	public static void main(String[] args) {
		
		//클래스로 직접 참조한다. 정적 변수>static일 것이다
		Student.studentId = 20201000;
		
		Student kim = new Student("김유신", "국문과", 1);
		kim.studentInfo();		
		
		Student lee = new Student("이순신", "경제학과", 1);
		lee.studentInfo();		
		
		Student lim = new Student("임꺽정", "경영학과", 1);
		lim.studentInfo();		
		
	}
}
