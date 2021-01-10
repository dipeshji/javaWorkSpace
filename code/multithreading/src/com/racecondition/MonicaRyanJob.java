package com.racecondition;

public class MonicaRyanJob implements Runnable {
	private BankAccount account = new BankAccount();

	public static void main(String[] args) {
		Runnable job = new MonicaRyanJob();
		Thread monica = new Thread(job);
		Thread ryan = new Thread(job);

		monica.setName("Monica");
		ryan.setName("Ryan");

		monica.start();
		ryan.start();
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			withdrawMoney(10);

			if (account.getBalance() < 0) {
				System.out.println("Warning!! overdrawn");
			}
		}
	}

	private synchronized void withdrawMoney(int amount) {
		if (account.getBalance() >= amount) {
			System.out.println(Thread.currentThread().getName() + " is about to withdraw money");

			try {
				System.out.println(Thread.currentThread().getName() + " is sleeping");
				Thread.sleep(500);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}

			System.out.println(Thread.currentThread().getName() + " woke up! ");

			account.withdraw(amount);
			System.out.println(Thread.currentThread().getName() + " has withdrawn $" + amount);
		} else {
			System.out.println("sorry!! not sufficient balance");
		}
	}
}
