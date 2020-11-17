package PolyAbstractInterface;

public class Circle extends Shape{
	private double radius;
	
	Circle(){}
	Circle(double radius){
		this.radius = radius;
	}
	
	Circle(double radius, String color, boolean filled){
		super(color,filled);
		this.radius  = radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		return "Radius: " + radius;
	}
	
	@Override
	public double getArea(){
		return 3.2;
	}
	
	@Override
	public double getPerimeter() {
		return 3.4;
	}
}
