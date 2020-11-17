package Basics;
import java.util.Comparator;

public class EmployeeSortingByName implements Comparator<EmployeeDefaultSordingBasedOnId>{
	@Override
	public int compare(EmployeeDefaultSordingBasedOnId obj1, EmployeeDefaultSordingBasedOnId obj2) {
		String name1 = obj1.getName();
		String name2 = obj2.getName();
		
		return name1.compareTo(name2);
	}
}
