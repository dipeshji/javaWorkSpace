class EmployeeComparable implements Comparable
{
   String name;
   int empid;
  EmployeeComparable(String name, int empid)
   {
     this.name = name;
     this.empid=empid;
   }
   public String toString()
     {
      return name+"------"+empid;
     }
   public int compareTo(Object obj)
       {
         int empid1 = this.empid;   //obj1.compareTo(obj)
         EmployeeComparable e = (EmployeeComparable) obj;
          int empid2 = e.empid;
         if(empid1<empid2)
            return -1;
         else if (empid1>empid2)
                return 1;
              else
                 return 0;
      }
  }

