package sub4;

public class Account {

	/* 
	 * protected와 pubilc의 차이
	 * public은 전체공개
	 * protected는 같은 패키지 안에서 접근 가능
	 */
	
	protected String bank;
	protected String id;
	protected String name;
	protected int balance;
	
	public Account(String bank, String id, String name, int balance) {
		this.bank = bank;
		this.id = id;
		this.name = name;
		this.balance = balance; 		
		
	}
	
	public void deposit(int money) {
		this.balance += money;
	}
	public void withdraw(int money) {
		this.balance -= money;
	}
	public void show() {
		System.out.println("은행명 : " + bank);
		System.out.println("계좌번호 : " + id);
		System.out.println("예금주 : " + name);
		System.out.println("잔액 : " + balance);
	}
}
