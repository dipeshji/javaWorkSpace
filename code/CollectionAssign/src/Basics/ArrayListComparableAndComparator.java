package Basics;
import java.lang.Comparable;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListComparableAndComparator implements Comparable<ArrayListComparableAndComparator>{
	private String name;
	
	ArrayListComparableAndComparator(String name){
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	@Override
	public int compareTo(ArrayListComparableAndComparator obj1) {
		return -this.name.compareTo(obj1.name); //Decending order
	}
	
	@Override
	public String toString() {
		return this.name;
	}
	
	
}

class mainClass{
	public static void main(String[] args) {
		ArrayList<ArrayListComparableAndComparator> nameAl = new ArrayList<>();
		
		nameAl.add(new ArrayListComparableAndComparator("Dipesh"));
		nameAl.add(new ArrayListComparableAndComparator("Ankit"));
		nameAl.add(new ArrayListComparableAndComparator("Mahesh"));
		nameAl.add(new ArrayListComparableAndComparator("Sandeep"));
		nameAl.add(new ArrayListComparableAndComparator("Palak"));
		
		
		Collections.sort(nameAl);
		System.out.println(nameAl);
		
//		==============comparator as lambda function======================
		Collections.sort(nameAl, (obj1, obj2) -> {
			return obj1.getName().compareTo(obj2.getName());
		});
		
		System.out.println(nameAl);
	}
}
