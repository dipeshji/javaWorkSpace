package Basics;
import java.lang.Comparable;

public class EmployeeDefaultSordingBasedOnId implements Comparable<EmployeeDefaultSordingBasedOnId>{
	private String name;
	private int id;
	
	EmployeeDefaultSordingBasedOnId(String name, int id){
		this.name = name;
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "[" + "Name: " + this.name + " ID: " + this.id + "]";
	}
	
	public String getName() {
		return this.name;
	}
	
	public int compareTo(EmployeeDefaultSordingBasedOnId obj1) {
		int id1 = this.id;
		int id2 = obj1.id;
		
		if(id1 > id2) return +1;
		else if(id1 < id2) return -1;
		else return 0;
	}
}
