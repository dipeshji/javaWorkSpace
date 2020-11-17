import java.util.*;
class EmployeeComparisionUsingEmployeeComparator
{
   public static void main(String[] str)
     {
       EmployeeComparator e1 = new EmployeeComparator("Neeraj",100);
       EmployeeComparator e2 = new EmployeeComparator("Arun",200);
       EmployeeComparator e3 = new EmployeeComparator("Ajay",150);
       EmployeeComparator e4 = new EmployeeComparator("Shubham",170);
       EmployeeComparator e5 = new EmployeeComparator("Neeraj",100);
     // TreeSet ts = new TreeSet(); 
//new EmployeeComparator());
    TreeSet ts = new TreeSet(new EmployeeComparator("XY",201));
       ts.add(e1);ts.add(e2);ts.add(e3);
       ts.add(e4);ts.add(e5);
       System.out.println(ts); 
}
}

