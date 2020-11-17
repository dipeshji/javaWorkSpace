import java.lang.reflect.Method;
import java.lang.reflect.Constructor;

class GetClassDemo2
{ static int count =0;
 public static void main(String[] str) throws ClassNotFoundException
 {
   Class c = Class.forName(str[0]);
  
// Employee e = new Employee(100,"fds");
// Class c = e.getClass();
 			// Class c = Employee.class;
   						// Class c = java.lang.String.class;
   					//System.out.println( "Full Qualfied Name of Class : "+e.getClass().getName());

   System.out.println( "Full Qualfied Name of Class : "+c.getName());
   System.out.println( "Full Qualfied Name of Class : "+c.getSuperclass().getName());
   Method[] m = c.getDeclaredMethods();
   for(Method m1:m)
   {
      System.out.println(m1.getName());
   }  


  Constructor[] c1=c.getDeclaredConstructors();
  for(Constructor c2:c1)
  {
   count++;
    System.out.println(c2.getName());
   }
   System.out.println("Total Constructor are : "+count);
  

 }
}



public class GetClassDemo
{
public static void main(String[] str)
 { int count=0;
  Object o = new String("Neeraj");
  Class c = o.getClass();
 System.out.println( "Full Qualfied Name of Class : "+c.getName());
 Method[] m = c.getDeclaredMethods();
 Constructor[] c1=c.getDeclaredConstructors();
 for(Method m1:m)
  {
   count++;
    System.out.println(m1.getName());
   }
   System.out.println("Total Methods are : "+count);
 count=0;
for(Constructor m1:c1)
  {
   count++;
    System.out.println(m1.getName());
   }
   System.out.println("Total Constructor are : "+count);
  
}
}
/*
 class GetClassDemo1
{
public static void main(String[] str)
 { int count=0;
  //Object o = new String("Neeraj");
  Student o = new Student();
  Class c = o.getClass();
 System.out.println( "Full Qualfied Name of Class : "+c.getName());
 Method[] m = c.getDeclaredMethods();
 Constructor[] c1=c.getDeclaredConstructors();
 for(Method m1:m)
  {
   count++;
    System.out.println(m1.getName());
   }
   System.out.println("Total Methods are : "+count);
 count=0;
for(Constructor m1:c1)
  {
   count++;
    System.out.println(m1.getName());
   }
   System.out.println("Total Constructor are : "+count);
  
}
} */