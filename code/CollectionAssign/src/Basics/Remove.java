package Basics;
import java.util.ArrayList;
import java.util.Collections;

public class Remove {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		
		for(int i =0; i<6; i++) {
			al.add(i);
		}
		
		System.out.println(al);
		
		al.remove(1);
		System.out.println(al);
		
		Collections.reverse(al);
		System.out.println(al);
		
		Collections.shuffle(al);
		System.out.println(al);
		
		System.out.println(al.size());
		
		System.out.println(al.contains(4));
		al.set(2, 1);
		System.out.println(al);
	}
}
