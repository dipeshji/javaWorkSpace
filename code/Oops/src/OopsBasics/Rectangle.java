package OopsBasics;

public class Rectangle {
	float length = 1.0f;
	float width = 1.0f;
	
	Rectangle(){
		System.out.println("Default Constructor");
	}
	
	Rectangle(float length, float width){
		this.length = length;
		this.width = width;
	}
	
	// getters===================================
	public float getLength() {
		return length;
	}
	
	public float getWidth() {
		return width;
	}
	
	public double getArea() {
		return width*length;
	}
	
	public double getPerameter() {
		return width*width*width;
	}
	
	//setters==================================
	
	public void setLength(float length) {
		this.length = length;
	}
	
	public void setWidth(float width) {
		this.width = width;
	}
	
	//toString overriding
	public String toString() {
		return length + " " + width;
	}
}


