package Sorting;

import java.util.Comparator;

public class SortByName implements Comparator<Student> {
	public int compare(Student stu1, Student stu2) {
		return stu1.name.compareTo(stu2.name);
	}
}
