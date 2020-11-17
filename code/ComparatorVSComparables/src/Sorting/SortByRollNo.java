package Sorting;

import java.util.Comparator;

public class SortByRollNo implements Comparator<Student> {
	@Override
	public int compare(Student stu1, Student stu2) {
		if(stu1.rollNo == stu2.rollNo) {
			return stu1.name.compareTo(stu2.name);
		}else return stu1.rollNo - stu2.rollNo;
	}
}
