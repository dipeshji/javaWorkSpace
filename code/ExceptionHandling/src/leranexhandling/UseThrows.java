package leranexhandling;



public class UseThrows implements Train{
	
	public void drive() {
		System.out.println("Driving");
	}
	
	public static void main(String args[]) {
		UseThrows use = new UseThrows();
		
		use.drive();
	}
}
