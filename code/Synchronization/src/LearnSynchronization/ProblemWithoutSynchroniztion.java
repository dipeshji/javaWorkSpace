package LearnSynchronization;

class Table{
	void printTable(int n) {
		for(int i = 1; i < 5; i++) 
		{
			System.out.println(n*i);
			try
			{  
			      Thread.sleep(400);  
			}
			catch(Exception e)
			{
				System.out.println(e);
			}  
		}  
	}
}

class ProblemWithoutSynchroniztion extends Thread {
Table t;
ProblemWithoutSynchroniztion(Table t){
	this.t = t;
}

public void run() {
	t.printTable(5);
}
}

class ProblemWithoutSynchroniztion1 extends Thread {
Table t;
ProblemWithoutSynchroniztion1(Table t){
	this.t = t;
}

public void run() {
	t.printTable(20);
}
}

class ProblemWithoutSynchronizationTest {
	public static void main(String[] args) {
		Table tableObj = new Table();
		ProblemWithoutSynchroniztion t1 = new ProblemWithoutSynchroniztion(tableObj);
		ProblemWithoutSynchroniztion1 t2 = new ProblemWithoutSynchroniztion1(tableObj);
		
		t1.start();
		t2.start();
	}
}
