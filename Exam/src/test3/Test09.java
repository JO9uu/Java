package test3;
/*
 * 날짜: 2024/01/04
 * 이름: 정원구
 * 내용: 추상 클래스, 다형성 연습문제
 */

?????? class Shape{
	public abstract void draw();
}

class Triangle extends Shape {
	@Override
	public void draw() {
		System.out.println("draw Triangle!");
	}
}

class Circle extends ????{
	@Override
	public void draw() {
		System.out.println("draw Circle!");
	}
}

public class Test09 {
	
	public static void main(String[] args) {
		
		Test09 here = new Test09();
		
		Circle circle = new Circle();
		Triangle tringle = new Triangle();
		
		here.draw(circle);
		here.draw(tringle);
	}
	
	public void draw(???? obj) {
		obj.draw();
		
	}

}
