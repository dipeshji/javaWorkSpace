package learnMultiThreading;

public class GettersAndSettersOfThread extends Thread {
	public void run() {
		System.out.println("Thread Running");
	}
}


class GettersAndSettersOfThreadTest{
	public static void main(String[] args) {
		GettersAndSettersOfThread t1 = new GettersAndSettersOfThread();
		GettersAndSettersOfThread t2 = new GettersAndSettersOfThread();
		
		System.out.println("t1 name: " + t1.getName());
		System.out.println("t2 name: " + t2.getName());
		System.out.println("t1 ID: " + t1.getId());
		System.out.println("t2 ID: " + t2.getId());
		
		t1.start();
		t2.start();
		
		t1.setName("My thrade");
		
		System.out.println("t1 changed name: " + t1.getName());
	}
	
	
}