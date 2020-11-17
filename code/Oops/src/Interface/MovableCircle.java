package Interface;

public class MovableCircle implements Movable {
	
	private MovablePoint center;
	private int radius;
	
	public MovableCircle(MovablePoint center, int radius) {
		this.center = center;
		this.radius = radius;
	}

	@Override
	public void moveUp() {
		center.y -= center.ySpeed;
	}

	@Override
	public void moveDown() {
		center.y += center.ySpeed;
	}

	@Override
	public void moveLeft() {
		center.x -= center.xSpeed;
	}

	@Override
	public String toString() {
		return "MovableCircle [center=" + center + ", radius=" + radius + "]";
	}

	@Override
	public void moveRight() {
		center.x = center.xSpeed;
	}
	
	

}
