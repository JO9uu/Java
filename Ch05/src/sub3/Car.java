package sub3;




public class Car {

	//속성(필드)
	private String name;
	private String color;
	private int speed;	
	
	
	//정적 변수=클래스 변수, 직접 참조를 하기 때문에 public 사용
	
	public static int count; 
	
	//클래스 메서드(정적 메서드)
	public static int getCount() {
		return count;
	}
	
	//생성자 - 캡슐화된 속성을 초기화(변수값 최초 대입)하기 위한 메서드
	
	public Car(String name, String color, int speed) {
		this.name = name; 
		this.color = color;
		this.speed = speed;
		
		// 객체 생성 할 때 차량수를 1씩 증가
		count++;
		
	}
	
	// 기능(메서드)
	public void speedUp(int speed) {
		this.speed += speed; //this는 범위를 한정 .은 참조연산자
	}
	
	public void speedDown(int speed) {
	this.speed -= speed;
	
	}

	public void show() {
		System.out.println("차량명 : " + this.name );
		System.out.println("차량색 : " + this.color );
		System.out.println("현재속도 : " + this.speed );
	}

	//Getter, Setter (필요에 따라 정의)

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
    
		
		

	}


