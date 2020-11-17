package OopsBasics;

public class Player {
	private int number;
	private float x;
	private float y;
	private float z = 0.0f;
	
	Player(int number, float x, float y){
		this.number = number;
		this.x = x;
		this.y = y;
	}
	
	public void move(float xDisp, float yDisp) {
		this.x += xDisp;
		this.y += yDisp;
	}
	
	public void jump(float zDisp) {
		this.z += zDisp;
	}
	
	public boolean near(SoccerBall ball) {
		if(ball.getX() == this.x && ball.getY() == this.y && ball.getZ() == this.z) return true;
		else return false;
	}
	
	public void kick(SoccerBall ball) {
		
	}
}
