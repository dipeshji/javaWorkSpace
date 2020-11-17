package Interface;

public class MovableRectangle implements Movable {
	
	MovablePoint topLeft;
	MovablePoint bottomRight;
	
	public MovableRectangle(int x1,int y1,int x2, int y2, int xSpeed, int ySpeed) {
		this.topLeft.x = x1;
		this.topLeft.y = y1;
		this.topLeft.xSpeed = xSpeed;
		this.topLeft.ySpeed = ySpeed;
		
		this.bottomRight.x = x2;
		this.bottomRight.y = y2;
		this.bottomRight.xSpeed = xSpeed;
		this.bottomRight.ySpeed = ySpeed;
	}

	@Override
	public void moveUp() {
		
	}

	@Override
	public void moveDown() {
		// TODO Auto-generated method stub

	}

	@Override
	public void moveLeft() {
		// TODO Auto-generated method stub

	}

	@Override
	public void moveRight() {
		// TODO Auto-generated method stub

	}

}
