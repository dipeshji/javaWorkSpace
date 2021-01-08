package learnMultiThreading;

public class ThreadJoin extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i + " " + Thread.currentThread().getName());

		}
	}
}

//class ThreadJoinTest{
//	public static void main(String[] args) {
//		ThreadJoin t1 = new ThreadJoin();
//		ThreadJoin t2 = new ThreadJoin();
//		ThreadJoin t3 = new ThreadJoin();
//		
//		t1.start();
//		
//		try {
//			t1.join();
//		}catch (Exception e) {
//			System.out.println(e);
//		}
//			
//		t2.start();
//		t3.start();
//	}
//}

//join(long miliseconds)
class ThreadJoinTesta {
	public static void main(String[] args) {
		Thread t = new Thread();
		ThreadJoin t1 = new ThreadJoin();
		ThreadJoin t2 = new ThreadJoin();
		ThreadJoin t3 = new ThreadJoin();
		Runnable runnableThreadJob = new ThreadJoin();
		RunIn ru = new RunIn();
		ru.run();

		Thread th = new Thread(runnableThreadJob);

		th.start();

		t1.start();
		try {
			t1.join(1500); // will execute for 1500 miliseconds
		} catch (Exception e) {
			System.out.println(e);
		}

		t2.start();
		t3.start();
		t.start();

		System.out.println("Back in main");
	}
}

class RunIn implements Runnable {

	@Override
	public void run() {
		System.out.println("thread implemented usin runnable interface");

	}

}
