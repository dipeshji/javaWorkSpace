package PolyAbstractInterface;

public class Main {
	public static void main(String[] args) {
		Shape s1 = new Circle(5.5, "RED", false);
		System.out.println(s1);
		System.out.println(s1.getArea());
		System.out.println(s1.getColor());
		
		Circle c1 = (Circle)s1;
		System.out.println(c1);
	}
}
