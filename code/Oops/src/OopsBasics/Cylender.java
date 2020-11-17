package OopsBasics;

public class Cylender extends Circle {
	private double height = 1.0;
	
	public Cylender() {
		super();
	}
	
	public Cylender(double height) {
		this.height = height;
	}
	
	public Cylender(double radius, double height) {
		super(radius);
		this.height = height;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getVolume() {
		return super.getArea() * height;
	}
	
	@Override
	public double getArea() {
		return (2 * 3.14 * getRadius() * height + 2 * getVolume());
	}
	
	@Override
	public String toString() {
		return ("Cylender is subclass of: " + super.toString() + " height = " + height);
	}
}
