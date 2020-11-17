/*
 * self implemented linkedlist
 * */

package LinkedList;

public class LinkedList {
	
	private Node head;
	
//	add=======================================================
	public void add(int data) {
		Node toAdd = new Node(data);
		Node temp = head;
		
		if(head == null) {
			head = toAdd;
			return;
		}
		
		while(temp.next != null) {
			temp = temp.next;
		}
		
		temp.next = toAdd;
		
	}
	
//	print=======================================
	
	public void printLinkedList() {
		
		Node temp = head;
		
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
 
//	remove=========================================
	public Node remove(int index) {
		Node temp = head;
		
		for(int i=0; i<index-1;i++) {
			temp = temp.next;
		}
		
		temp.next = temp.next.next;
		
		return head;
		
		
	}
	
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	
}
