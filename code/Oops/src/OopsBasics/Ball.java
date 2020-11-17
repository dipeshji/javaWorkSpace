package OopsBasics;

public class Ball {
	private float x;
	private float y;
	private int radius;
	private float xDelta;
	private float yDelta;
	
	Ball(float x, float y, int radius, int speed, int direction){
		this.x = x;
		this.y = y;
		this.radius = radius;
		
		double radians = Math.toRadians(direction);
		this.xDelta = (float) (speed * Math.cos(radians));
		
		this.yDelta = (float) (-speed * Math.sin(radians)); 
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public float getxDelta() {
		return xDelta;
	}

	public void setxDelta(int direction, int speed) {
		double radians = Math.toRadians(direction);
		this.xDelta = (float) (speed * Math.cos(radians));
	}

	public float getyDelta() {
		return yDelta;
	}

	public void setyDelta(int direction, int speed) {
		double radians = Math.toRadians(direction);
		this.xDelta = (float) (-speed * Math.cos(radians));
	}
	
	public void move() {
		this.xDelta += 1;
		this.yDelta += 1;
	}
	
	public void reflectHorizontal() {
		xDelta = -xDelta;
	}
	
	public void reflectVertical() {
		yDelta = -yDelta;
	}
	
	@Override
	public String toString() {
		return "Ball at " + "(" + x + "," + y + ")" + "of velocity " + "("+ xDelta + "," + yDelta + ")";
	}
}
