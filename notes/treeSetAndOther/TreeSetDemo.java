import java.util.*;
public class TreeSetDemo {
      public static void main(String[] args) {
      TreeSet ts = new TreeSet(); //default natural sorting order
      ts.add("Vijay");      
      ts.add("Dina");
      ts.add("Nath");
      ts.add("Chouhan");  
       System.out.print("\t" + ts);

      TreeSet ts1 = new TreeSet();
      ts1.add(20);
       ts1.add(10);
       ts1.add(30);
     System.out.print("\t" + ts1); 

 // ts.add(null); //NullPointerException
   //    ts.add(25); //ClassCastException
   //  System.out.println(ts.add("Chouhan"));
   //   System.out.print("\t" + ts);
 //     System.out.println(ts.first());
   //   System.out.println(ts.last());
     // System.out.println(ts.subSet("Dina","Vijay"));
     //ts.tailSet("Dina") //"dina ... ... ...
     //ts.headSet("dina") // ... ... ...   
      
     }
}
