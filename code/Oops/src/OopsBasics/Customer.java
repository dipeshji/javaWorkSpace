package OopsBasics;

public class Customer {
	private int id;
	private String name;
	private int discount;
	private char gender;
	
	Customer(int id, String name, int discount, char gender){
		this.id = id;
		this.name = name;
		this.discount = discount;
		this.gender = gender;
	}
	
	Customer(int id, String name, int discount){
		this.id = id;
		this.name = name;
		this.discount = discount;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getDiscount() {
		return discount;
	}
	
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
	public char getGender() {
		return this.gender;
	}
	
	@Override
	public String toString() {
		return name + "(" + (id) + ")";
	}
}
