 import java.util.*;
public class TreeSetComprator {
      public static void main(String[] args) {
    // TreeSet ts = new TreeSet(); //d.N.S.O.
   TreeSet ts = new TreeSet(new MyComprator());
 				//  TreeSet ts = new TreeSet(new MyComprator11());
      ts.add(10);  ts.add(0);
      ts.add(2);  ts.add(15);
      System.out.println(ts.add(20));  
     System.out.println(ts.add(20));
      System.out.print("\t" + ts);
      }
}




 class MyComprator implements Comparator
{
  public int compare(Object obj1, Object obj2) {
  Integer I1 = (Integer) obj1;
  Integer I2 = (Integer) obj2;
   if(I1<I2)  return 1;
   else if (I1>I2) return -1;
        else return 0;
 }
} 

class MyComprator11 implements Comparator
{
  public int compare(Object obj1, Object obj2) {
  Integer I1 = (Integer) obj1;
 Integer I2 = (Integer) obj2;
  //  return I1.compareTo(I2); //Ascending Order
 // return I2.compareTo(I1); //Descending Order
  // return -I1.compareTo(I2);//Descending Order
  // return -I2.compareTo(I1);Ascending Order
     return +1; // insertion Order
  // return -1; // reverse of insertion order
// return 0; // Only one element(first) is inserted and all other will be considered duplicate element 
 }
}