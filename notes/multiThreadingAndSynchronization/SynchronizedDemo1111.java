class Hello
{
   public synchronized  void hi(String name)
    {
   for(int i=0;i<10;i++)
    {
     System.out.print("Hello All  :");
     try { Thread.sleep(2000); } 
     catch (InterruptedException e) { } 
    System.out.println(name);
    }
}
public synchronized   void hi1(String name)
    {
   for(int i=0;i<10;i++)
    {
     System.out.print("Hello All  :");
     try { Thread.sleep(2000); } 
     catch (InterruptedException e) { } 
    System.out.println(name);
    }
}
}
class MyThread1 extends Thread
{ Hello h;
  String name;
  MyThread1(Hello h1, String name)
   { this.h=h1; this.name= name; }
  public void run()
    { h.hi1(name); }
}


class MyThread extends Thread
{ Hello h;
  String name;
  MyThread(Hello h1, String name)
   { this.h=h1; this.name= name; }
  public void run()
    { h.hi(name); }
}




class SynchronizedDemo1111
{
public static void main(String[] args)
{
Hello h =new Hello();
                                 //Hello h1 =new Hello();
MyThread t1 = new MyThread(h,"Neeraj");
t1.start();
				//h.hi("Don");
                               //MyThread t2 = new MyThread(h1,"Paliwal");
MyThread1 t3 = new MyThread1(h,"Neeraj1");
			//MyThread t4 = new MyThread(h,"Paliwal1");
                        //t2.start();
t3.start();
			//t4.start();
			//for(int i=0;i<10;i++)
			//	 System.out.println("Main Thread");
}
}