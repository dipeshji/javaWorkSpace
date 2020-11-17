package Sorting;

public class Student {
	public String name;
	public int age;
	public int rollNo;
	
	Student(String name, int age, int rollNo){
		this.name = name;
		this.age = age;
		this.rollNo = rollNo;
	}
	
	@Override
	public String toString(){
		return "[" + "Name: " + name + " Roll No: " + rollNo + " Age: " + age + "]";
	}
	
}
