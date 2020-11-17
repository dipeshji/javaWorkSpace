package OopsBasics;

public class MyTriangle {
	private MyPoint v1;
	private MyPoint v2;
	private MyPoint v3;
	
	MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3){
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;
	}
	
	MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3){
		this.v1.setX(x1);
		this.v1.setY(y1);
		
		this.v2.setX(x2);
		this.v2.setY(y2);
		
		this.v3.setX(x3);
		this.v3.setY(y3);
	}
	
	@Override
	public String toString() {
		return "MyTriangle" + "[" + "v1=" + "("+ v1.getX() + "," + v1.getY() +")" 
								+ "v2=" + "("+ v2.getX() + "," + v2.getY() +")" 
								+ "v3=" + "("+ v3.getX() + "," + v3.getY() +")" +"]";
	}
}
