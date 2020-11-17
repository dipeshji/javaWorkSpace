package learnMultiThreading;

public class ThreadClass extends Thread{
	public void run() {
		System.out.println("Thread is running...");
	}
}

class ThreadClassTest{
	public static void main(String[] args) {
		ThreadClass t1 = new ThreadClass();
		t1.start();
	}
}
