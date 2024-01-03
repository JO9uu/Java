package sub4;

/*
 * 날짜: 2024/01/03
 * 이름: 정원구
 * 내용: 상속 실습하기
 * 
 */



public class StockAccount extends Account {

	private String stock;
	private int amount;
	private int price;

	public StockAccount(String bank, 
			            String id, 
			            String name, 
			            int balance, 
			            String stock, 
			            int amount, 
			            int price){
		
		super(bank, id, name, balance);
	
		this.stock = stock;
		this.amount = amount;
		this.price = price;
		
	}	
	
	public void sell(int amount, int price) {
		this.amount -= amount;
		this.balance += amount*price;
		
	}
	public void buy(int amount, int price) {
		this.amount += amount;
		this.balance -= amount*price;
		
	}
	public void show() {

		System.out.println("주식종목 : " + this.stock);
		System.out.println("주식수량 : " + this.amount);
		System.out.println("주식가격 : " + this.price);
		
	}
	
	
	
	
	
	
}
