package Sorting;

import java.util.Comparator;

public class SortByAge implements Comparator<Student> {

@Override
 public int compare(Student stu1, Student stu2) {
	 return stu1.age - stu2.age;
//	 return stu1.age>stu2.age ? 1 : -1;
 }
}
