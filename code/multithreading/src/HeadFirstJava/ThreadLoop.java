package HeadFirstJava;

public class ThreadLoop implements Runnable {
	public void run() {
		for (int i = 0; i < 25; i++) {
			System.out.println(Thread.currentThread().getName() + "  " + "is running " + i);
		}
	}

	public static void main(String[] args) {
		Runnable runner = new ThreadLoop();

		Thread alpha = new Thread(runner);
		Thread beta = new Thread(runner);

		alpha.setName("Alpha");
		beta.setName("Beta");

		alpha.start();
		beta.start();
	}
}
