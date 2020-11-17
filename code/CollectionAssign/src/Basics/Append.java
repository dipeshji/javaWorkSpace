package Basics;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Collections;
import java.util.Vector;
import java.util.List;
import java.util.LinkedList;

public class Append {
	public static void main(String args[]) {
		List<Integer> vec = new Vector<>();
		
		vec.add(10);
		vec.add(20);
		vec.add(10);
		vec.add(40);
		vec.add(50);
		vec.add(10);
		vec.add(70);
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(100);
		al.add(200);
		al.addAll(vec);
		al.addAll(0, vec);
		
		System.out.println(al);
		
		al.remove(2);
		System.out.println(al);
		
		List<Integer> l = al.subList(0, 5);
		
		System.out.println(l);
		System.out.println(al.lastIndexOf(10));
		System.out.println(al.indexOf(10));
		
		System.out.println(al.get(2));
		
		System.out.println(al.contains(20));
		
		System.out.println(vec.equals(al));
		
		Collections.synchronizedList(al);
		
		Integer current = al.get(0);
		al.set(0, al.get(1));
		al.set(1, current);
		System.out.println(al);
		
		ArrayList clone = new ArrayList(al);
		System.out.println(clone);
		clone.clear();
		System.out.println(clone);
		System.out.println(clone.isEmpty());
		al.trimToSize();
		System.out.println(al.size());
		
		
		LinkedList ll = new LinkedList(al);
		ListIterator lItr = ll.listIterator(ll.size());
		
		while(lItr.hasPrevious()) {
			System.out.println(lItr.previous());
		}
		
		System.out.println(ll.contains(10));
		System.out.println(ll.lastIndexOf(10));
		
		ll.pop();
		ll.push(20);
		System.out.println(ll);
		
		System.out.println(ll.peek());
		System.out.println(ll.peekLast());
		System.out.println(ll.peekFirst());
		
		ll.toArray();
		System.out.println(ll);
	}
}
