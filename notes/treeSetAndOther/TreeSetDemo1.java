import java.util.*;
public class TreeSetDemo1 {
      public static void main(String[] args) {
      TreeSet ts = new TreeSet(); // d.N.S.O.
      ts.add(new StringBuffer("Dina"));
      ts.add(new StringBuffer("Nath"));
      ts.add(new StringBuffer("Chouhan"));      
      System.out.print("\t" + ts);
     }
}
 





class TreeSetDemo2 {
      public static void main(String[] args) {
      TreeSet ts = new TreeSet(new MyComp()); //Customized Sorting
      ts.add(new StringBuffer("Dina"));
      ts.add(new StringBuffer("Nath"));
      ts.add(new StringBuffer("Chouhan"));      
      System.out.print("\t" + ts);
     }
}

class MyComp implements Comparator
{
 public int compare(Object o,Object o1)
   {
     StringBuffer sb = (StringBuffer) o;
     StringBuffer sb1 = (StringBuffer) o1;
      String s = new String(sb);
      String s1 = new String(sb1);
         return s.compareTo(s1);  //Ascending
    


  
     //  return -s.compareTo(s1); //Descending
   //  return s1.compareTo(s); //Descending
      //return -s1.compareTo(s); //Ascending
   //    return -1;   // reverse of insertion order
     // return 1;  // insertion order
   // return 0;
    }
}  