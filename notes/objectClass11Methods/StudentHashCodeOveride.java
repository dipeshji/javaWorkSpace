class StudentHashCodeOveride
{
int sno;
String name;
StudentHashCodeOveride(int sno, String name )
{
this.sno=sno;
this.name=name;
}
/*
public int hashCode()     //not proper Overriding
{
return 100;
}   */

public static void main(String[] args)
{
StudentHashCodeOveride s = new StudentHashCodeOveride(105, "Neeraj");
StudentHashCodeOveride s1 = new StudentHashCodeOveride(101, "Ram");
System.out.println(s.hashCode());
System.out.println(s1.hashCode());
System.out.println(s);
System.out.println(s1);
}



 public String toString()
{
return "Student no : " +sno+ " Student Name : "+name ;
}  
 public int hashCode()  //Proper Overriding
{
return sno;
}    
   
}







