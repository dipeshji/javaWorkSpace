package Generics;

public class MultipleBounds<T extends Acls & Bint & Cint> {
	
	private T objRef;
	
	public MultipleBounds(T objRef) {
		this.objRef = objRef;
	}
	
	public void runTest() {
		objRef.displayMessage();
	}
}

interface Bint{
	public void displayMessage();
}

interface Cint{
	public void displayMessage();
}

class Acls implements Bint,Cint {
	public void displayMessage() {
		System.out.println("Class A multiple bound display message");
	}
}
