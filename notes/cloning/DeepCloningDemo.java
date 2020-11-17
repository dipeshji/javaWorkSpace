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
protected Object clone() throws CloneNotSupportedException 
{ A a1 = new A(obA.a);
  B b1= new B(a1,b);
  return b1;  
 }
}
class DeepCloningDemo 
{
public static void main(String []a) throws CloneNotSupportedException
{
  A x = new A(23);
  B y = new B(x, 24);
  B y1 = (B) y.clone();
  //System.out.println(y1.b +"    " +y1.obA.a);
   //y1.b=100;
   //y1.obA.a= 200;
System.out.println(y1.b +"    " + y1.obA.a);
System.out.println(y.b +"    " + y.obA.a);
}
}