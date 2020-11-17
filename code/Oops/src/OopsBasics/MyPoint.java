package OopsBasics;

public class MyPoint {
	private int x;
	private int y;
	
	MyPoint(){
		this.x = 0;
		this.y = 0;
	}
	
	MyPoint(int x, int y){
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int[] getXY() {
		int[] location = {x,y};
		return location;
	}
	
	@Override
	public String toString() {
		return  "(" + this.x + "," + this.y + ")" ;
	}
	
	public int[] distance(int x, int y) {
		int[] distance = {this.x - x, this.y - y};
		return distance;
	}
	
	public int[] distance(MyPoint point) {
		int[] distance = {this.x - point.x, this.y - point.y};
		return distance;
	}
	
	public int[] distance() {
		int[] distance = {this.x, this.y};
		return distance;
	}
}
