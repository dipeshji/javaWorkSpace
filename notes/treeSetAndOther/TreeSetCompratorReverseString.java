import java.util.*;
public class TreeSetCompratorReverseString {
      public static void main(String[] args) {
      TreeSet ts = new TreeSet();
      ts.add("Neeraj");
      ts.add("Ramesh");
      ts.add("Ankur");
      ts.add("Ram");
      ts.add("Shyam");
      System.out.print("\t" + ts);
 TreeSet ts1 = new TreeSet(new MyComprator());
      ts1.add("Neeraj");
      ts1.add("Ramesh");
      ts1.add("Ankur");
      ts1.add("Ram");
      ts1.add("Shyam");
      System.out.print("\t" + ts1); 

      }
}
class MyComprator implements Comparator
{
  public int compare(Object obj1, Object obj2) {
  String str1 = (String) obj1;
  String str2 = (String) obj2;
   return str2.compareTo(str1);
 //return -str1.compareTo(str2);
 }
} 