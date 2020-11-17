class ToStringDemo
{
public static void main(String[] args)
{
 Integer I = new Integer(20);
//we can use toString() Method to get String representation of an object
String s = I.toString();                   //(new Integer(10)).toString();
System.out.println(s);
//String s1 = (new Employee()).toString();
Employee s1 = new Employee();
//whenever we are trying to print object reference, internally toString method()
//will be invoked
System.out.println(s1);
System.out.println(s1.toString());
}
}