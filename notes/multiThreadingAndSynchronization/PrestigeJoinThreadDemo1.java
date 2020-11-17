class PrestigeThread extends Thread
{
 static Thread mt;
public void run()   
 { 
    try {
       mt.join(); //Child thread will for completion of main thread
        } catch (InterruptedException e) { }
  
for(int i=0;i<10;i++)
     { 
      System.out.println("Child Thread"); 
     }
      
}
}

class PrestigeJoinThreadDemo1 
  {
    public static void main(String[] args) throws InterruptedException
     {
       PrestigeThread.mt = Thread.currentThread();
       PrestigeThread pt = new PrestigeThread();
         pt.start();
      			//pt.join();   //main thread has to wait for child
         for(int i=0;i<10;i++)
         {   System.out.println("Main Thread");
            try { Thread.sleep(2000); } catch (Exception e) { } 
       }
     }
}