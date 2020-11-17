class A
{
int a;
A(int j) { a=j;}
}

class B implements Cloneable
{
A obA;
int b;
B(A r, int z)
{
obA =r;
b=z;
}
public Object clone() throws CloneNotSupportedException 
{ return super.clone(); }
}

class ShallowCloningDemo 
{
public static void main(String []a) throws CloneNotSupportedException
{
  A x = new A(23);
  B y = new B(x, 24);
  B y1 = (B) y.clone();
  System.out.println(y1.b +"    " +y1.obA.a);
   y1.b=100;
   y1.obA.a= 200;
System.out.println(y1.b +"    " + y1.obA.a);
System.out.println(y.b +"    " + y.obA.a);
System.out.println(y.obA.hashCode());
System.out.println(y1.obA.hashCode());
}
}