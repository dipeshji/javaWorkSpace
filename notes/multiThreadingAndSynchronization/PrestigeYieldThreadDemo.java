 class PrestigeThread extends Thread
{
public void run() 
 { 
    for(int i=0;i<10;i++)
 
     {    // Thread.yield();
  
      System.out.println("Child 1 Thread"); 
        
      }
 }
}
  
class PrestigeYieldThreadDemo 
  {
    public static void main(String[] args) 
     {
       PrestigeThread pt = new PrestigeThread();
         pt.start();
      	Thread.yield();
    					 // PrestigeThread1 pt1 = new PrestigeThread1();
     					//  pt1.start();
       for(int i=0;i<10;i++)
         {   System.out.println("Main Thread"); 
       }
     }
}








class PrestigeThread1 extends Thread
{
public void run() 
 { 
  for(int i=0;i<10;i++)
     { 
      System.out.println("Child 2 Thread"); 
      
}
      }
}