class Hello
{
   public  static synchronized void hi(String name)
    {
   for(int i=0;i<10;i++)
    {
     System.out.print("Hello All  :");
    			// try { Thread.sleep(2000); } 
    			 //catch (InterruptedException e) { } 
    System.out.println(name);
    }
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
class StaticSynchronizedDemo
{
public static void main(String[] args)
{
Hello h =new Hello();
Hello h1 =new Hello();
MyThread t1 = new MyThread(h,"Neeraj");
		//MyThread t2 = new MyThread(h1,"Paliwal");
MyThread t3 = new MyThread(h1,"Neeraj1");
		//MyThread t4 = new MyThread(h1,"Paliwal1");
t1.start();
		//t2.start();
t3.start();
		//t4.start();

}
}