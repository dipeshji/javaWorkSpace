package OopsBasics;

public class CircleIn extends Shape{

	private double radius =  1.0;
	
	public CircleIn() {};
	
	public CircleIn(double radius) {
		this.radius = radius;
	}
	
	public CircleIn(double radius, String color, boolean filled) {
		super(color,filled);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return 3.14 * radius * radius;
	}
	
	public double getPerimeter() {
		return 2 * 3.14 * radius;
	}
	
	@Override
	public String toString() {
		return "A circle with radius = " + radius + "," 
				+ "whic is a subclass of Shape" + "," 
				+ " where " + super.toString() 
				+ "is the output of toString method of super class";
	}

}
