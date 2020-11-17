package learnMultiThreading;

public class ThreadSleep extends Thread{
public void run() {
	for(int i=0;i<5;i++) {
		try 
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException e) 
		{
			System.out.println(e);
		}

		System.out.println(i);
		if(i==4) {
			System.out.println("Task Completed");
		}
	}
}
}

class ThreadSleepTest{
	public static void main(String[] args) {
		ThreadSleep t1 = new ThreadSleep();
		ThreadSleep t2 = new ThreadSleep();
		t1.start();
		t2.start();
	}
}
