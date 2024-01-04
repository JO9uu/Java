package test3;
/*
 * 날짜: 2024/01/04
 * 이름: 정원구
 * 내용: 클래스 생성자 연습문제
 */

class King{
	private String name;
	private int year;
	
	public King(String name, int year) {
		this("정조");
		this.year = year;
		
	}
	public class k2 {
		this.name = name;
	}	
	public ???????????{
		this.name = name;
		this.year = year;
		
	}
		

	public void show() {
		System.out.println("name : " + name);
		System.out.println("year : " + year);
	}
}

public class Test02 {
	public static void main(String[] args) {
		King k1 = new King("태조", 1392);ㅣ
		King k2 = new King("세종대왕");ㅣ
		King k3 = new King(1776);
		
		k1.show();
		k2.show();
		k3.show();
	}

}
