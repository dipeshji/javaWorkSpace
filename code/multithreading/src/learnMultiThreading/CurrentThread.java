package learnMultiThreading;

public class CurrentThread extends Thread {
public void run() {
	System.out.println(Thread.currentThread().getName());
}
}

class CurrentThreadTest{
	public static void main(String[] args) {
		CurrentThread t1 = new CurrentThread();
		CurrentThread t2 = new CurrentThread();
		
		t1.setName("First Thread Name Changed");
		t1.start();
		t2.start();
	}
}




