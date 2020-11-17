package Basics;
import java.util.ArrayList;
import java.util.Collections;

public class SortingArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(10);
		al.add(0);
		al.add(20);
		al.add(100);
		al.add(80);
		al.add(900);
		
		Collections.sort(al);
		
		System.out.println(al);
		
		ArrayList<Integer> al2 = new ArrayList<>();
		
		al2.add(10);
		al2.add(0);
		al2.add(20);
		al2.add(100);
		al2.add(80);
		al2.add(900);
		
		Collections.sort(al2, new ArrayListComparator());
		System.out.println(al2);
	}
}
