package test;

//복습용 
public class Mango {

	private String country;
	private int price;
	
	public Mango(String country,int price) {
		this.country = country;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Mango [country=" + country + ", price=" + price + "]";
	}
	
	
}
