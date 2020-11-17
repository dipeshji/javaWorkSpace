import java.util.*;
public class TreeSetCompratorReverseStringBufferandString {
      public static void main(String[] args) {
      TreeSet ts = new TreeSet(new myComprator());
    /*  ts.add(new StringBuffer("Neeraj"));
      ts.add(new StringBuffer("Ramesh"));
      ts.add(new StringBuffer("Ankur"));
      ts.add(new StringBuffer("Ram"));
      ts.add(new StringBuffer("Shyam")); */
      ts.add("Heo");
      ts.add("A");
      ts.add("AB");
      ts.add("ABC"); 
      System.out.print("\t" + ts);
      }
}
class myComprator implements Comparator
{
  public int compare(Object obj1, Object obj2) {
  String str1 = obj1.toString();//String str1 = (string) obj1;
  String str2 =  obj2.toString();
  int length1 = str1.length();   
  int length2 = str2.length();
  if (length1 < length2)
     return -1;
  else if (length1>length2)
       return +1;
  else 
       return str1.compareTo(str2);  //"abc" , "hello"
 }
} 