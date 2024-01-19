package sub1;
/*
 * 날짜: 2024/01/19
 * 이름: 정원구
 * 내용: 수행평가
 */
public class Account {
	private String ano;
	private String owner;
	private int balance;
	
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	@Override
	public String toString() {return this.ano+"      " + 
	this.owner+ "       " + this.balance;}
	
	public String getAno() {return ano;}
	public void setAno(String ano) {this.ano = ano;}
	public String getOwner() {return owner;}
	public void setOwner(String owner) {this.owner = owner;}
	public int getBalance() {return balance;}
	public void setBalance(int balance) {this.balance = balance;}

	
}