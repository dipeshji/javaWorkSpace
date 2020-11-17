package OopsBasics;

public class Line {

	private Point begin;
	private Point end;
	
	public Line(Point begin, Point end) {
		this.begin = begin;
		this.end = end;
	}
	
	public Line(int beginX, int beginY, int endX, int endY) {
		this.begin = new Point(beginX, beginY);
		this.end = new Point(endX, endY);
	}
	
	public int getLength() {
		int diffX = begin.getX() - end.getX();
		int diffY = begin.getY() - end.getY();
		
		return (diffX * diffX + diffY * diffY);
	}
	
	public double getGradient() {
		int diffX = begin.getX() - end.getX();
		int diffY = begin.getY() - end.getY();
		return Math.atan2(diffX, diffY);
	}

}
