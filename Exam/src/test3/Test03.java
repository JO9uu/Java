package test3;
/*
 * 날짜: 2024/01/04
 * 이름: 정원구
 * 내용: 클래스 연습문제
 */

class Car{
	//속성
	private String brand;
	private String name;
	private int price;
	
	//생성자, 대체적으로 이런 패턴을 가진다 정도로 생각
	public Car(String brand, String name, int price) {
		this.brand = brand;
		this.name = name;
		this.price = price;
	}
	
	public void drive() {
		System.out.println(name + " 운행 중...");
	}
	
	public void info() {
		System.out.println("브랜드 : " + brand);
		System.out.println("차량명 : " + name);
		System.out.println("가 격 : " + price );
	}
}

public class Test03 {
	public static void main(String[] args) {
		
		//참조변수 null 값으로 초기화
		Car sonata = null;
		Car bmw = null;
		
		sonata = new Car("현대", "소나타", 3000); 
		bmw = new Car("BMW", "520d", 5000);
				
		sonata.drive();
		sonata.info();
		
		bmw.drive();
		bmw.info();
	}

}
