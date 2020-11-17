package shallowClone;

class A
{
	int a;
	
	A(int a) //Constructor
	{
		this.a = a;
	}
}

public class cloning implements Cloneable {
	A aobj;
	int z;
	cloning(A obj,int z ){
		this.aobj = obj;
		this.z = z;
	}
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}

class shallowCloningDemo {
	public static void main(String[] args)throws CloneNotSupportedException {
		A a = new A(10);
		cloning cloneObj = new cloning(a, 20);
		cloning cloneObj2 = (cloning) cloneObj.clone();
		
		System.out.println("cloneobj.aobj.a => " + cloneObj.aobj.a);
		System.out.println("cloneobj1.aobj.a => " + cloneObj2.aobj.a);
		
		cloneObj.aobj.a = 1000;
		
		System.out.println("cloneobj.aobj.a => " + cloneObj.aobj.a); //o/p 1000
		System.out.println("cloneobj1.aobj.a => " + cloneObj2.aobj.a); //o/p 1000
		
		System.out.println(cloneObj.aobj.hashCode());
		System.out.println(cloneObj2.aobj.hashCode());
	}
}

