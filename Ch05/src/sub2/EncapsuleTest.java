package sub2;
/*
 * 날짜: 2024/01/02
 * 이름: 정원구
 * 내용: Java 클래스 실습하기 
 */
public class EncapsuleTest {

	public static void main(String[] args) {
		
	//객체 생성
		
	Car sonata = new Car("소나타", "검은색", 0);
	
	/*
	 * 취약코드(직접적으로 대입하기 때문)> private으로 캡슐화(Car 클래스 참고)
	 * 캡슐화된 속성에 대한 초기화는 생성자에서 수행
	*/
	
	//sonata.name = "소나타";
	//sonata.color = "흰색";
	//sonata.speed = 0;
	
	sonata.speedUp(80);
	sonata.speedDown(20);	
	sonata.show();	
	
	//캡슐화 된 속성에 대한 수정을 위해 setter 호출
	sonata.setColor("회색");
	
	sonata.show();

	//accoung 객체 생성 및 초기화
	
	Account kb = new Account ("국민은행", "123-456-78-9", "김유신", 10000);
	//Account kb = new Account();
	//kb.bank = "국민은행";
	//kb.id  = "123-456-78-9";
	//kb.balance = 10000;

	kb.deposit(80000);
	kb.withdraw(7000);
	kb.show();
		
		
	}
}
