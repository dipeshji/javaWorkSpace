class StudentEqualsOverride2{
int sno;
String name;
StudentEqualsOverride2(int sno, String name )
{
this.sno=sno;
this.name=name;
}
public boolean equals(Object o)
{
if(this==o)  //if both reference variable pointed to the same object,
             //No need of comparision
 return true;
else
if( o instanceof StudentEqualsOverride2)
{
StudentEqualsOverride2 s2 = (StudentEqualsOverride2) o;
if(sno== s2.sno && name.equals(s2.name))
  return true;
else 
   return false; 
}
else 
return false;
}

public static void main(String[] args)
{
StudentEqualsOverride2 s = new StudentEqualsOverride2(100, "Neeraj");
StudentEqualsOverride2 s1 = new StudentEqualsOverride2(100, "Neeraj");
System.out.println(s.equals(s1));
StudentEqualsOverride2 s2 = s1;
System.out.println(s.equals(s2));
System.out.println(s1.equals(s2));
//Employee e = new Employee();
//System.out.println(s.equals(e));
System.out.println(s.equals("Neeraj"));

}
}
