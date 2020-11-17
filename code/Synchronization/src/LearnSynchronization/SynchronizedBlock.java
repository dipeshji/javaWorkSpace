package LearnSynchronization;


class Table2{
	public void printTable(int n) {
		System.out.println("Out side of sync");
		synchronized(this) {  //synchronized block
			for (int i=0; i<=5; i++) {
				System.out.println(i*n);
				
				try {
					Thread.sleep(400);
				}catch(Exception e) {
					System.out.println(e);
				}
			}
		}
	}
}

public class SynchronizedBlock extends Thread {
	Table2 t;
	public SynchronizedBlock(Table2 obj) {
		this.t = obj;
	}
	
	public void run(){
		t.printTable(5);
	}
}

class SynchronizedBlock1 extends Thread{
	Table2 t;
	
	public SynchronizedBlock1(Table2 obj) {
		this.t = obj;
	}
	
	public void run() {
		t.printTable(100);
	}
}


class SynchronizedBlockTest{
	public static void main(String[] args) {
		Table2 obj = new Table2();
		
		SynchronizedBlock t1 = new SynchronizedBlock(obj);
		SynchronizedBlock1 t2 = new SynchronizedBlock1(obj);
		
		t1.start();
		t2.start();
	}
}