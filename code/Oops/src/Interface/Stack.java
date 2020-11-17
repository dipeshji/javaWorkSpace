package Interface;

public class Stack {
	private int contains[];
	private int tos;
	
	public Stack(int capacity) {
		contains = new int[capacity];
		tos=-1;
	}
	
	public void push(int element) {
		tos++;
		contains[tos] = element;
	}
	
	public void displayStack() {
		for(tos=tos;tos>-1;tos--) {
			System.out.println(contains[tos]);
		}
	}
	
	public int pop() {
		int popEle = contains[tos];
		System.out.println(contains[tos]);
		tos--;
		return popEle;
	}
}
