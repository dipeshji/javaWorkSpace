/*
 * Using static synchronization we can acheive class level lock
 * While a thread executing any static synchronized method the remaining threads are not allow to
	execute any static synchronized method of that class simultaneously. But remaining threads are allowed
	to execute normal synchronized methods, normal static methods,and normal instance methods
	simultaneously.
 */

package LearnSynchronization;

class Table4 {
	
	int count = 0;
	
	public synchronized void increaseCounter() {
		this.count++;
		System.out.println(this.count);
	}
	
	public synchronized static void printTable(int n) {
		System.out.println(Thread.currentThread().getName());
		for (int i=1; i<=5; i++) {
			System.out.println(i*n);
			
			try {
				Thread.sleep(400);
			}catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

public class StaticSynchronization extends Thread {
	public void run() {
		Table4.printTable(5);
		Table4 t = new Table4();
		t.increaseCounter();
	}
}

class StaticSynchronization1 extends Thread {
	public void run() {
		Table4 t = new Table4();
		t.increaseCounter();
		Table4.printTable(10);
		
	}
}


class StaticSynchronizationTest{
	public static void main(String[] args) {
		StaticSynchronization t1 = new StaticSynchronization();
		StaticSynchronization t2 = new StaticSynchronization();
		
//		StaticSynchronization1 t3 = new StaticSynchronization1();
//		StaticSynchronization1 t4 = new StaticSynchronization1();
		
		t1.start();
		t2.start();
//		t3.start();
//		t4.start();
	}
}
