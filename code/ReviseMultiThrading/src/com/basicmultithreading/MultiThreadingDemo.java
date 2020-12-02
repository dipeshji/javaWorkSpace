package com.basicmultithreading;

public class MultiThreadingDemo extends Thread{
	public void run() {
		System.out.println("thread started");
	}
	
	public static void main(String[] args) {
		MultiThreadingDemo mt = new MultiThreadingDemo();
		mt.start();
	}
}
