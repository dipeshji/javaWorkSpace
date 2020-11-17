package learnMultiThreading;

public class multiThreading implements Runnable {
public void run() {
	System.out.println("Thread running...");
}
}

class MultiThreadingDemo{
	public static void main(String[] args) {
		multiThreading obj1 = new multiThreading();
		Thread t1 = new Thread(obj1);
		t1.start();
	}
	
}
