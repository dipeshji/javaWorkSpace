class PrestigeThread extends Thread
{
public void run() 
 { System.out.println(Thread.currentThread().getPriority());
  for(int i=0;i<10;i++)

     { 
    //  try { Thread.sleep(2000); } catch (Exception e ) { }
     System.out.println("Child Thread"); }
  }
}
class PrestigePriorityThreadDemo 
  {
    public static void main(String[] args) 
     {
       PrestigeThread pt = new PrestigeThread();
    //    System.out.println(Thread.currentThread().getPriority());
     //  System.out.println(pt.getPriority());
      	
         pt.start();			//PrestigeThread pt1 = new PrestigeThread();
        pt.setPriority(10);  
      	
       				// pt1.start();
    //   System.out.println(Thread.currentThread().getPriority());
     //  System.out.println(pt.getPriority());
      				// Thread.currentThread().setPriority(1);
     				 // System.out.println(Thread.currentThread().getPriority());
       for(int i=0;i<10;i++)
         { 					//try { Thread.sleep(2000); } catch (Exception e ) { }
         System.out.println("Main Thread"); 
       }
     // pt.start(); 
}
}