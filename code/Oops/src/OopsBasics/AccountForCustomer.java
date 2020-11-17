package OopsBasics;

public class AccountForCustomer {
	private int id;
	private Customer customer;
	private double balance;
	
	AccountForCustomer(int id, Customer customer, double balance) {
		this.id = id;
		this.customer = customer;
		this.balance = balance;
	}
	
	AccountForCustomer(int id, Customer customer) {
		this.id = id;
		this.customer = customer;
	}

	public int getId() {
		return id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public String getCustomerName() {
		return this.customer.getName();
	}
	
	public AccountForCustomer deposit(double amount) {
		this.balance += amount;
		return this;
	}
	
	public AccountForCustomer withdraw(double amount) {
		if(this.balance > amount) this.balance -= amount;
		else System.out.println("Insufficient balance");
		return this;
	}
}
