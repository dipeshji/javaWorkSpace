package LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList myLinkedList = new LinkedList();
		
		for(int i=0;i<=10;i++) {
			myLinkedList.add(i);
		}
		
		myLinkedList.printLinkedList();
		
		
		myLinkedList.remove(7);
		
		System.out.println("============================================");
		myLinkedList.printLinkedList();
	}
}
