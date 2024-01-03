package sub4;

public class InheritanceTest {

	public static void main(String[] args) {
		
		//car 상속개체 생성
		
		Sedan sonata = new Sedan("소나타", "흰색", 0 , 2000);
		sonata.speedUp(80);
		sonata.speedTurbo();
		sonata.show();
		
		Truck bongo = new Truck("봉고", "남색", 0, 0);
		bongo.load(100);
		bongo.speedUp(60);
		bongo.show();
		
		StockAccount kb = new StockAccount 
				("kb증권", 
				"123-456-78-9", 
				"홍길동", 1000000, 
				"삼성전자", 0 ,0);
		
		kb.deposit(1000000);
		kb.buy(10, 50000);
		kb.sell(5, 50000);
		
		kb.show();
		
		
	}
	
}
