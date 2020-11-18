package HashSet;

import java.util.HashSet;

import java.util.Iterator;

public class MyHashSet {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for(int i=0; i<10; i++) {
			hs.add(i);
		}
		
		hs.remove(9);
		
		HashSet<String> sHs = new HashSet<String>();
		
		sHs.add("Hello");
		sHs.add("World");
		sHs.add("Have");
		sHs.add("Great");
		sHs.add("Day!");
		
//		System.out.println(sHs);
		
		sHs.remove("Hello");
		
//		System.out.println(sHs);
//		
//		System.out.println(hs);
		
		
		Iterator<String> itr = sHs.iterator();
		
		while(itr.hasNext())
			System.out.println(itr.next());
		
		for(String s: sHs) {
		
		System.out.println(s);
	}
}
}