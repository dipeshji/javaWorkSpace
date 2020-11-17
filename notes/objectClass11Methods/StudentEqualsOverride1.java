class StudentEqualsOverride1{
int sno;
String name;
StudentEqualsOverride1(int sno, String name )
{
this.sno=sno;
this.name=name;
}
public boolean equals(Object o)
{
try{
StudentEqualsOverride1 s2 = (StudentEqualsOverride1) o;
if(sno== s2.sno && name.equals(s2.name))
  return true;
else 
   return false; }
catch(ClassCastException cce) 
{ System.out.println(" Objects belongs to different classes");
return false; } 
catch(NullPointerException npe) { System.out.println(" Objects can't compared"); 
return false;}
}
public static void main(String[] args)
{
StudentEqualsOverride1 s = new StudentEqualsOverride1(100, "Neeraj");
StudentEqualsOverride1 s1 = new StudentEqualsOverride1(100, "Neeraj");
System.out.println(s.equals(s1));
StudentEqualsOverride1 s2 = new StudentEqualsOverride1(101, "Neeraj");
System.out.println(s.equals(s2)); 
//System.out.println(s.equals(null));
Employee e = new Employee(100,"Neeraj");
System.out.println(s.equals(e));
//System.out.println(s.equals("Neeraj"));

}
}
