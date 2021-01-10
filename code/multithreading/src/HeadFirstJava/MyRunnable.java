package HeadFirstJava;

public class MyRunnable implements Runnable {
	public void run() {
		go();
	}

	public void go() {
		try {
			System.out.println("Thread sleeping");
			Thread.sleep(2000);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}

		System.out.println("Thread wokeup");
		doMore();

	}

	public void doMore() {
		System.out.println("top o' the stack");
	}
}

class Main {
	public static void main(String[] args) {
		Runnable job = new MyRunnable();
		Thread th = new Thread(job);
		th.start();

		System.out.println("Back in main");
	}
}
