package Basics;
import java.util.ArrayList;
import java.util.Collections;

public class Highest2ndElement {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		
	al.add(100);
	al.add(10);
	al.add(70);
	al.add(500);
	al.add(400);
	
	Collections.sort(al);
	int index = al.size() - 2;
	System.out.println("2nd Highest number in list => " + al + " is: " + al.get(index));
	}
}
