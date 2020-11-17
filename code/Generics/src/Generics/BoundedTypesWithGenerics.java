package Generics;

public class BoundedTypesWithGenerics <T extends A> {
	private T objRef;
	
	public BoundedTypesWithGenerics(T objRef) {
		this.objRef = objRef;
	}
	
	public void runTest() {
		objRef.displayMessage();
	}
}

class A{
	
	public void displayMessage() {
		System.out.println("Class A display message");
	}
}

class B extends A {
	public void displayMessage() {
		System.out.println("Class B display message");
	}
}

class C extends A{
	
	public void displayMessage() {
		System.out.println("Class C display message");
	}
}

class D{
	public void displayMessage() {
		System.out.println("Class D display message");
	}
}

