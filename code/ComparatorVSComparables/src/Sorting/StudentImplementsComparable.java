/*
 * Comparables defines a fixed sorting  manner of a class. 
 * Current class is sorting on basis of rollNo
 * */

package Sorting;

public class StudentImplementsComparable implements Comparable<StudentImplementsComparable> {

	private String name;
	private int rollNo;
	private int age;
	
	
	
	public StudentImplementsComparable(String name, int rollNo, int age) {
		this.name = name;
		this.rollNo = rollNo;
		this.age = age;
	}


	@Override
	public String toString() {
		return "[" + "Name: " + name + " Roll No: " + rollNo + " Age: " + age + "]";
	}
	
	
	@Override
	public int compareTo(StudentImplementsComparable o) {
		return this.rollNo - o.rollNo;
	}

}
