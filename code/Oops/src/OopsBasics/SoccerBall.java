package OopsBasics;

public class SoccerBall {
	private float x;
	private float y;
	private float z;
	
	SoccerBall(float x, float y, float z){
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public float getX() {
		return x;
	}

	public float getY() {
		return y;
	}

	public float getZ() {
		return z;
	}
	
	public void setXYZ(float x, float y, float z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	@Override
	public String toString() {
		return "(" + x + "," + y + "," + z +")";
	}
}