import java.util.*;
public class TreeSetCompratorReverseStringBuffer {
      public static void main(String[] args) {
      TreeSet ts = new TreeSet(new myComprator());
      ts.add(new StringBuffer("Neeraj"));
      ts.add(new StringBuffer("Ramesh"));
      ts.add(new StringBuffer("Ankur"));
      ts.add(new StringBuffer("Ram"));
      ts.add(new StringBuffer("Shyam"));
      System.out.print( ts);
      }
}
class myComprator implements Comparator
{
  public int compare(Object obj1, Object obj2) {
  String str1 = obj1.toString();
  String str2 =  obj2.toString();
   return str2.compareTo(str1);
 //return -str1.compareTo(str2);
 }
} 