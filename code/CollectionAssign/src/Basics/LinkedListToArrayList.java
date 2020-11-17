package Basics;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListToArrayList {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		
		ll.add(10);
		ll.add(20);
		
		ArrayList al = new ArrayList(ll);
		System.out.println(al);
		
		al.toString();
		
		System.out.println(al);
	}
}
