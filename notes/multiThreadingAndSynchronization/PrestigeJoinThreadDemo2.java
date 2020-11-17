class PrestigeThread extends Thread
{  PrestigeThread1 t;
    PrestigeThread( PrestigeThread1 t)
     { this.t=t;}
public void run()   
 { try {t.join(); } catch(Exception e) { }
for(int i=0;i<10;i++)
 
      System.out.println("Child Thread 1"); 
   }
}
class PrestigeThread1 extends Thread
{
 public void run()   
 { 
 for(int i=0;i<10;i++)
     System.out.println("Child Thread 2"); 
 
}
}


class PrestigeJoinThreadDemo2 
  {
    public static void main(String[] args) throws InterruptedException
     {
       PrestigeThread1 pt1 = new PrestigeThread1();
       PrestigeThread pt = new PrestigeThread(pt1);
       
         pt.start();
         pt1.start();
         
         
     }
}