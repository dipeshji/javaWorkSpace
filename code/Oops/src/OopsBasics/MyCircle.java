package OopsBasics;

public class MyCircle {
	private MyPoint center;
	private int radius;
	
	MyCircle(){
		this.center.setXY(0, 0);
		this.radius = 1;
	}
	
	MyCircle(MyPoint center, int radius){
		this.center = center;
		this.radius = radius;
	}
	
	MyCircle(int x, int y, int radius){
		this.center.setXY(x, y);
		this.radius = radius;
	}

	public MyPoint getCenter() {
		return center;
	}

	public void setCenter(MyPoint center) {
		this.center = center;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public void setCenterXY(int x, int y) {
		this.center.setXY(x, y);
	}
	
	
	@Override
	public String toString() {
		return "MyCircle" + "[" + "radius = " + this.getRadius() + "," + "center = " + center + "]" ;
	}
}
