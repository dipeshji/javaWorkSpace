import java.util.*;
public class TreeSetDemo2 {
      public static void main(String[] args) {
      /* TreeSet ts = new TreeSet();
      ts.add(10);
      ts.add(0);
      ts.add(5);
      ts.add(15);
      ts.add(20);
      ts.add(20);
      System.out.print("\t" + ts);  */
      
   TreeSet ts1 = new TreeSet(new M());
      ts1.add(10);
      ts1.add(0);
      ts1.add(5);
      ts1.add(15);
      ts1.add(20);
      ts1.add(20);
      System.out.print("\t" + ts1);


     }
}

class M implements Comparator
{
 public int compare(Object obj1,Object obj2)
   {
    Integer I1 = (Integer) obj1;
    Integer I2 = (Integer) obj2;
   // return I2.compareTo(I1);
    //  return -I2.compareTo(I1);
     //return -I1.compareTo(I2);
     //  return 1;   //insertion order
     // return -1; //reverse of insertion order
     //  return 0;

/*
    if(I1>I2)
       return -1;
     else if(I1<I2)
         return 1;
          else
           return 0; 
   if(I1>I2)
       return 1;
     else if(I1<I2)
         return -1;
          else
           return 0;  */
      
    }
}