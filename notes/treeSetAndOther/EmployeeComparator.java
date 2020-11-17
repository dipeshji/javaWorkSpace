import java.util.*;
class EmployeeComparator implements Comparator
{
   String name;
   int empid;
  EmployeeComparator() { }
  EmployeeComparator(String name, int empid)
   {
     this.name = name;
     this.empid=empid;
   }
   public String toString()
     {
      return name+"------"+empid;
     }
   public int compare(Object obj1,Object obj2)
       {
         EmployeeComparator e = (EmployeeComparator) obj1;
         int empid1 = e.empid;
         EmployeeComparator e1 = (EmployeeComparator) obj2;
          int empid2 = e1.empid;
         if(empid1<empid2)
            return -1;
         else if (empid1>empid2)
                return 1;
              else
                 return 0;
      }
  }

