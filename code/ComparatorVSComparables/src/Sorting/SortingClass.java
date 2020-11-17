package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class SortingClass {
	public static void main(String[] args) {
		ArrayList<Student> ar = new ArrayList<Student>();
		
		ar.add(new Student("Dipesh", 25, 101));
		ar.add(new Student("Piyush", 27, 101));
		ar.add(new Student("Akshay", 19, 150));
		ar.add(new Student("Samar", 20, 100));
		
		Collections.sort(ar,new SortByRollNo());
		
		System.out.println(ar);
		
		Collections.sort(ar, new SortByName());
		System.out.println(ar);
		
		Collections.sort(ar, new SortByAge());
		System.out.println(ar);
		
//		Comparable
		
		ArrayList<StudentImplementsComparable> ar1 = new ArrayList<StudentImplementsComparable>();
		
		ar1.add(new StudentImplementsComparable("Dipesh", 25, 112));
		ar1.add(new StudentImplementsComparable("Piyush", 27, 101));
		ar1.add(new StudentImplementsComparable("Akshay", 19, 150));
		ar1.add(new StudentImplementsComparable("Samar", 20, 100));
		
		ar1.forEach(System.out::println);
		
		Collections.sort(ar1);
		
		System.out.println(ar1);
		
//		============CheckComparator for LIFO=================
		
		TreeSet<Integer> t1 = new TreeSet<Integer>(new CheckComparator());
		
		t1.add(10);
		t1.add(20);
		t1.add(40);
		t1.add(1);
		t1.add(9);
		t1.add(4);
		
		System.out.println(t1); //4,9,1,40,20,10 Last In First Out
		
		Iterator<Integer> itr = t1.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
