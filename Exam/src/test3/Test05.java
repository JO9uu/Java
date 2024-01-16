package test3;
/*
 * 날짜: 2024/01/04
 * 이름: 정원구
 * 내용: 싱글톤 객체 연습문제
 */

class Vehicle {
	//속성
	private String name;
	private int price;
	
	//생성자
	public Vehicle(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public void info() {
		System.out.println("===============");
		System.out.println("차량명 : " + name);
		System.out.println("가격 : " + price);
		System.out.println("---------------");
	}
}

class CarFactory{
	//싱글톤 패턴
	private static CarFactory instance = new CarFactory();
	private CarFactory() {}
	
	public static CarFactory getInstance() {
		return instance;
		
	}
	
	public  Vehicle createCar(String name, int price){
	
		Vehicle v = new Vehicle(name, price);	
		
		return v;
		
	}
}

public class Test05 {
	public static void main(String[] args) {
		
		CarFactory factory = CarFactory.getInstance();
		
		Vehicle avante = factory.createCar("아반테", 2500);
		Vehicle sonata = factory.createCar("소나타", 3000);
		
		avante.info();
		sonata.info();
		
		
	}

}
