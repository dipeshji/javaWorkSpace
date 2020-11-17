class Student
{
int sno;
String name;
Student(int sno, String name )
{
this.sno=sno;
this.name=name;
}
public static void main(String[] args)
{
Student s = new Student(100, "Neeraj");
Student s1 = new Student(101, "Ram");
System.out.println(s); // toString() method of Object 
			//Class internally invoked
System.out.println("string represtation of s :"+s.toString()); 
                          // toString() method of Objcet Class
System.out.println("string representation of s1 :"+s1.toString()); 

/*

String z ="ABC";
System.out.println(z); // ABC
Object o = new Student(101,"xyz");
System.out.println(o); */
} 
}
