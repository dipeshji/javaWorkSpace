class StudentEqualsOverride{
int sno;
String name;
StudentEqualsOverride(int sno, String name )
{
this.sno=sno;
this.name=name;
}
public boolean equals(Object o)
{
int SNO = this.sno;
String NAME = this.name;
StudentEqualsOverride s2 = (StudentEqualsOverride) o;
int SNO1=s2.sno;
String NAME1 = s2.name;
if(SNO == SNO1 && NAME.equals(NAME1))   //equals()method of String class
  return true;   // String class contain overidden equals() method and 
else             // it is meant for content comparision
   return false;
}
public static void main(String[] args)
{
StudentEqualsOverride s = new StudentEqualsOverride(100, "Neeraj");
StudentEqualsOverride s1 = new StudentEqualsOverride(100, "Neeraj");
System.out.println(s.equals(s1));
StudentEqualsOverride s2 = new StudentEqualsOverride(101, "Neeraj");
System.out.println(s.equals(s2));

//System.out.println(s.equals(null));

Employee e = new Employee(100,"Neeraj");
System.out.println(s.equals(e));
//System.out.println(s.equals("Neeraj"));

}
}
