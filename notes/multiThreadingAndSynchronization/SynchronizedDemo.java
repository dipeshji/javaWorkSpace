class Hello
{   int total;
   public synchronized void  hi(String name)
    {
   for(int i=0;i<10;i++)
    {
      total=total+i;
     System.out.println("Total : "+total);
     System.out.print("Hello All  :");
    			try { Thread.sleep(2000); } 
    			catch (InterruptedException e) { } 
    System.out.println(name);
    }
   System.out.println("Final Total : "+total); 
}
}
class MyThread extends Thread
{ Hello h;
  String name;
  MyThread(Hello h1, String name)
   { this.h=h1; this.name= name; }
  
  public void run()
    { h.hi(name); }
}

class SynchronizedDemo
{
public static void main(String[] args)
{
Hello h =new Hello();
Hello h1 =new Hello();
MyThread t1 = new MyThread(h,"Neeraj");
t1.start();
				//h.hi("Don");
			//MyThread t2 = new MyThread(h,"Paliwal");
MyThread33 t3 = new MyThread33(h,"Neeraj1");
				//MyThread t4 = new MyThread(h,"Paliwal1");
				//t2.start();
t3.start();
				//t4.start();
			//for(int i=0;i<10;i++)
			//	 System.out.println("Main Thread");
}
}


class MyThread33 extends Thread
{ Hello h;
  String name;
  MyThread33(Hello h1, String name)
   { this.h=h1; this.name= name; }
  
  public void run()
    { h.hi(name); }
}

