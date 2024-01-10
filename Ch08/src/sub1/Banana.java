package sub1;

public class Banana //extends Object 
{
	private String country;
	private int price;
	
	public Banana(String country, int price) {
		this.country = country;
		this.price = price;
		
	}

	
	@Override
	public String toString() {
		return "Banana [hashcord="+hashCode()+", country=" + country + ", price=" + price + "]";
	}

}
