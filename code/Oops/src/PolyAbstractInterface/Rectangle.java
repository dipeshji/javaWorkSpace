package PolyAbstractInterface;

public class Rectangle extends Shape {
	private double width;
	private double length;
	
	Rectangle(){}
	
	Rectangle(double width, double length){
		this.width = width;
		this.length = length;
	}
	
	Rectangle(double width, double length, String color, boolean filled){
		super(color, filled);
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
	
	@Override
	public String toString() {
		return "Width: " + width + "Length: " + length;
	}
	
	@Override
	public double getArea() {
		return 3.25;
	}
	
	@Override
	public double getPerimeter() {
		return 4.98;
	}
}
