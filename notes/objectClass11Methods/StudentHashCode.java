class StudentHashCode
{
int sno;
String name;
StudentHashCode(int sno, String name )
{
this.sno=sno;
this.name=name;
}
public static void main(String[] args)
{
StudentHashCode s = new StudentHashCode(100, "Neeraj");
StudentHashCode s1 = new StudentHashCode(101, "Ram");
System.out.println(s.hashCode());
System.out.println(s1.hashCode());
System.out.println(Integer.toHexString(s.hashCode()));
System.out.println(s);
}
}
