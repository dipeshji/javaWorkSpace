import java.util.*;
class EmployeeComparision
{
   public static void main(String[] str)
     {
       EmployeeComparable e1 = new EmployeeComparable("Neeraj",100);
       EmployeeComparable e2 = new EmployeeComparable("Arun",200);
       EmployeeComparable e3 = new EmployeeComparable("Ajay",150);
       EmployeeComparable e4 = new EmployeeComparable("Shubham",170);
       EmployeeComparable e5 = new EmployeeComparable("Neeraj",100);
       TreeSet ts = new TreeSet(); //D.n.S.O
       ts.add(e1);ts.add(e2);ts.add(e3);
       ts.add(e4);ts.add(e5);

       System.out.println(ts);  



//--------------------------------------------    
  TreeSet t = new TreeSet(new MyComprator());
   t.add(e1);t.add(e2);t.add(e3);
   t.add(e4);t.add(e5);
  // t.add("A");
   System.out.println(t);   
}
}

class MyComprator implements Comparator
{
  public int compare(Object ob1, Object ob2)
   {
    EmployeeComparable e1 = (EmployeeComparable) ob1;
    EmployeeComparable e2 = (EmployeeComparable) ob2;
    String s1 =e1.name;
    String s2 =e2.name;
    return s1.compareTo(s2);   // ascending order
     // return -s1.compareTo(s2);  // descending order
    //return s2.compareTo(s1); 
    // return -s2.compareTo(s1);   // ascending order
   // return -1;        // object are stored in insertion order
  //  return 1;   // reverse of insertion order
  // return 0;
   }  
}
/*
class EmployeeComparision
{
   public static void main(String[] str)
     {
       EmployeeComparable e1 = new EmployeeComparable("Neeraj",100);
       EmployeeComparable e2 = new EmployeeComparable("Arun",200);
       if(e1.comparTo(e2) == -1)
    }
} */