package LearnSynchronization;

class Table1{
	public synchronized void printTable(int n) {
		for (int i = 1; i <= 5; i++) 
		{
			System.out.println(i*n);
			try {
				Thread.sleep(400);
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}

public class SynchronizedMethod extends Thread {
	Table1 t;
	
	SynchronizedMethod(Table1 t) {
		this.t = t;
	}
	
	public void run() {
		t.printTable(10);
	}
}

class SynchronizedMethod1 extends Thread{
	Table1 t;
	
	SynchronizedMethod1(Table1 t) {
		this.t = t;
	}
	
	public void run() {
		t.printTable(100);
	}
}

class SynchronizedMethodTest{
	public static void main(String[] args) {
		Table1 tableObj = new Table1();
		
		SynchronizedMethod t1 = new SynchronizedMethod(tableObj);
		SynchronizedMethod1 t2 = new SynchronizedMethod1(tableObj);
		
		t1.start();
		t2.start();
	}
}
