package OopsBasics;

public class RectangleIn extends Shape{
	
	private double width = 1.0;
	private double length = 1.0;

	public RectangleIn() {};
	
	public RectangleIn(double width, double length) {
		this.width = width;
		this.length = length;
	}
	
	public RectangleIn(double width, double length, String color, boolean filled) {
		super(color,filled);
		this.width = width;
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	public double getArea() {
		return length * width;
	}
	
	public double getPerimeter() {
		return (length * length *length) + (width * width * width);
	}
	
	@Override
	public String toString() {
		return "A Rectangle with width = " + width 
				+ " and length = " + length + ","  
				+ "which is a subclass of Shape" + "," 
				+ " where " + super.toString() 
				+ "is the output of toString method of super class";
	}
	

}
