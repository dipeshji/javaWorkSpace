package OopsBasics;

public class Container {
	private int x;
	private int y;
	
	private int x2;
	private int y2;
	
	Container(int x, int y, int height, int width){
		this.x = x;
		this.y = y;
		
		this.x2 = this.x + width - 1;
		this.y2 = this.y + height - 1;
	}
	
	@Override
	public String toString() {
		return "Container at " + "("+ x + "," + y +")" + "to" + "("+ x2 + "," + y2 +")";
	}
	
	public boolean collidesWith(Ball ball) {
		if(ball.getX() - ball.getRadius() <= this.x || ball.getX() - ball.getRadius() >= this.x2){
			ball.reflectHorizontal();
			return true;
		}else {
			ball.reflectVertical();
			return true;
		}
	}
}
