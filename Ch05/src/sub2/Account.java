package sub2;

public class Account {
	
	//속성
	private String bank;
	private String id;
	private String name;
    private int balance;

    
    public Account(String bank, String id, String name, int balance) {
    	this.bank = bank;
    	this.id = id;
    	this.name = name;
    	this.balance = balance;
    	
    	
    	
    	
    }
    	
    	public void deposit (int money) {
    	this.balance += money;
    }

public void withdraw (int money) {
	this.balance -= money;
}

public void show() {
	System.out.println("은행명 : "+ bank);
	System.out.println("계좌번호 : "+ id);
	System.out.println("예금주 : " + name);
	System.out.println("계좌 잔액 : " + balance);
}




}
