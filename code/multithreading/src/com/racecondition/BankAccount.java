package com.racecondition;

public class BankAccount {
	private int balance = 100;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void withdraw(int amount) {
		this.balance -= amount;
	}

}
