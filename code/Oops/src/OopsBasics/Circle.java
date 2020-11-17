package OopsBasics;

public class Circle {
	private double radius = 1.0;
	private String color = "Red";

	Circle(){
		System.out.println("Default Constructor");
	}
	
	Circle(double radius){
		this.radius = radius;
	}
	
	Circle(double radius, String color){
		this.radius = radius;
		this.color = color;
	}	
	
//	getters========================
	
	public double getRadius() {
		return this.radius;
	}
	
	public double getArea() {
		return (3.14*radius*radius);
	}
	
	public String getColor() {
		return this.color;
	}
	
	public double getCurcumference() {
		return Math.PI * radius;
	}
//	setters=======================
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
//	overriding toString method
	@Override
	public String toString() {
		return "radius: " + radius + "," + "color: " + color;
	}
}
