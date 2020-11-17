class Student1
{
int sno;
String name;
Student1(int sno, String name )
{
this.sno=sno;
this.name=name;
}
public String toString()
{
return "Student no : " +sno+ " Student Name : "+name;
}
public static void main(String[] args)
{
Student1 s = new Student1(100, "Neeraj");
System.out.println(s); // toString() method of our Customized 
                       //Class(Student1) internaly invoked
System.out.println(s.toString());
}
}
