package Generics;

public class Basic<T> {
	private T obj;
	
	Basic(T obj){
		this.obj = obj;
	}
	
	public String getClassName() {
		
		if(obj instanceof PassClassAsGenericArgument) {
			System.out.println("instance of PassClassAsGenericArgument");
		}
		
		return this.obj.getClass().getSimpleName();
	}
	
	
}
