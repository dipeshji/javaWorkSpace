class PrestigeThread extends Thread
{
public void run()     				//throws InterruptedException
 { 
  for(int i=0;i<10;i++)
     { 
      System.out.println("Child Thread"); 
   					// Thread.sleep(2000);
           				  // try { Thread.sleep(2000); } catch (Exception e) { } 
      }
    }
} 

class PrestigeJoinThreadDemo 
  {
    public static void main(String[] args) throws InterruptedException
     {
       PrestigeThread pt = new PrestigeThread();
         pt.start();
    // pt.join();   //main thread has to wait for child
    pt.join(1); // main thread will wait for only 1/100 second
         for(int i=0;i<10;i++)
         {   System.out.println("Main Thread"); 
           }
     }
} 