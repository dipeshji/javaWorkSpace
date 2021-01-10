package com.basicmultithreading;

class Dealer {
	int supply;
	boolean produced = false;

	public synchronized void put(int supply) {
		if (produced) {
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		this.supply = supply;
		System.out.println("put: " + supply);
		produced = true;
		notify();
	}

	public synchronized void get() {

		if (!produced) {
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("get: " + supply);
		produced = false;
		notify();
	}
}

class Producer implements Runnable {
	Dealer dealer;

	Producer(Dealer dealer) {
		this.dealer = dealer;
		Thread produce = new Thread(this, "producer");
		produce.start();
	}

	public void run() {
		int i = 0;
		while (true) {
			dealer.put(i++);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Consumer implements Runnable {

	Dealer dealer;

	Consumer(Dealer dealer) {
		this.dealer = dealer;
		Thread consume = new Thread(this, "Consumer");
		consume.start();
	}

	public void run() {
		while (true) {
			dealer.get();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class ProducerComsumer {
	public static void main(String[] args) {
		Dealer deal = new Dealer();
		new Producer(deal);
		new Consumer(deal);
	}
}
