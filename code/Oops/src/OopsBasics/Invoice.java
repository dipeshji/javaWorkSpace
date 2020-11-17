package OopsBasics;

public class Invoice {
	int id;
	Customer customer;
	double amount;
	
	Invoice(int id, Customer customer, double amount){
		this.id = id;
		this.customer = customer;
		this.amount = amount;
	}

	public int getId() {
		return id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public String getCustomerName() {
		return this.customer.getName();
	}
	
	public double getAmountAfterDiscount() {
		return (this.amount/100)*this.customer.getDiscount();
	}
	
	
}
