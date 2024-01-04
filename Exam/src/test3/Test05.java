package test3;
/*
 * 날짜: 2024/01/04
 * 이름: 정원구
 * 내용: 싱글톤 객체 연습문제
 */

class Vehicle {
	private String name;
	private int price;
	
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
	private static CarFactory instance = new CarFactory();
	private CarFactory() {}
	
	public static CarFactory getInstance() {
		return instance;
		
	}
	
	public  createCar(String name, int price){
		return new Vehicle(name, price);
		
	}
}

public class Test05 {
	public static void main(String[] args) {
		
		CarFactory factory = new CarFactory();
		
		Vehicle avante = Factory.createCar("아반테", 2500);
		Vehicle sonata = Factory.createCar("소나타", 3000);
		
		avante.info();
		sonata.info();
		
		
	}

}
