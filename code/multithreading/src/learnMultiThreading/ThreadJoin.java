package learnMultiThreading;

public class ThreadJoin extends Thread {
public void run() {
	for(int i=0;i<5;i++) {
		try {
			Thread.sleep(500);
		}catch(InterruptedException e) {
			System.out.println(e);
		}
		System.out.println(i);
		
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
class ThreadJoinTest{
	public static void main(String[] args) {
		ThreadJoin t1 = new ThreadJoin();
		ThreadJoin t2 = new ThreadJoin();
		ThreadJoin t3 = new ThreadJoin();
		
		t1.start();
		try {
			t1.join(1500); //will execute for 1500 miliseconds
		}catch (Exception e) {
			System.out.println(e);
		}
		
		t2.start();
		t3.start();
	}
}
