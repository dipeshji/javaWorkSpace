class StudentEquals{
int sno;
String name;
StudentEquals(int sno, String name )
{
this.sno=sno;
this.name=name;
}

public static void main(String[] args)
{
StudentEquals s = new StudentEquals(100, "Neeraj");
StudentEquals s1 = new StudentEquals(100, "Neeraj");

System.out.println(s==s1);  // false


// Object class equals method will be called and it is 
//meant for reference comparision

System.out.println(s.equals(s1));


s=s1;
System.out.println(s==s1); //true
System.out.println(s.equals(s1)); //true




System.out.println(s.equals(null));



//System.out.println(null.equals(null));  //C.e.

     StudentEquals s2=null;
// System.out.println(s2.equals(null));



 System.out.println(null==null);

System.out.println(s2==null);

/*
Employee e = new Employee(100,"Neeraj");
System.out.println(s.equals(e));

 System.out.println(s.equals("Neeraj"));   */
//int a = 20;
//a.equals(20)

}
}
