package Interface;

public class Main {
	public static void main(String[] main) {
		Movable m1 = new MovablePoint(5, 6, 10, 15); //upcast
//		System.out.println(m1);
		
		m1.moveLeft();
//		System.out.println(m1);
		
		Movable m2 = new MovableCircle((MovablePoint)m1, 3);
//		System.out.println(m2);
		
		m2.moveRight();
//		System.out.println(m2);
		
//		======stack=================
		Stack s = new Stack(10);
		
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.displayStack();
		
//		System.out.println(s.pop());
		s.pop();
//		s.displayStack();
	}
}
