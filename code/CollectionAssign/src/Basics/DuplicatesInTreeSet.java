package Basics;
import java.util.TreeSet;

public class DuplicatesInTreeSet {
	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<Integer>(new MyComparator());
		t.add(10);
		t.add(0);
		t.add(20);
		t.add(9);
		t.add(9);
		
//		System.out.println(t);
		
//		========entering String and StringBuffer into TreeSet================
		
		TreeSet t2 = new TreeSet(new StringAndStringBufferObjectsInTreeSet());
		
		t2.add("AA");
		t2.add("B");
		t2.add(new StringBuffer("ZZZ"));
		t2.add(new StringBuffer("YYYY"));
		t2.add("A");
		t2.add("BB");
		
//		System.out.println(t2);
		
//		======employee default sorting by id=========================
		
		EmployeeDefaultSordingBasedOnId emp1 = new EmployeeDefaultSordingBasedOnId("Dipesh",101);
		EmployeeDefaultSordingBasedOnId emp2 = new EmployeeDefaultSordingBasedOnId("Mahesh",110);
		EmployeeDefaultSordingBasedOnId emp3 = new EmployeeDefaultSordingBasedOnId("Palak",103);
		EmployeeDefaultSordingBasedOnId emp4 = new EmployeeDefaultSordingBasedOnId("Neha",107);
		EmployeeDefaultSordingBasedOnId emp5 = new EmployeeDefaultSordingBasedOnId("Kapil",102);
		
		TreeSet<EmployeeDefaultSordingBasedOnId> employee = new TreeSet<EmployeeDefaultSordingBasedOnId>(); //Default sorting by id
		employee.add(emp1);
		employee.add(emp2);
		employee.add(emp3);
		employee.add(emp4);
		employee.add(emp5);
		
//		System.out.println(employee);
		
//		=============employee customized sorting by name====================
		
		EmployeeDefaultSordingBasedOnId emp11 = new EmployeeDefaultSordingBasedOnId("Dipesh",101);
		EmployeeDefaultSordingBasedOnId emp22 = new EmployeeDefaultSordingBasedOnId("Mahesh",110);
		EmployeeDefaultSordingBasedOnId emp33 = new EmployeeDefaultSordingBasedOnId("Palak",103);
		EmployeeDefaultSordingBasedOnId emp44 = new EmployeeDefaultSordingBasedOnId("Neha",107);
		EmployeeDefaultSordingBasedOnId emp55 = new EmployeeDefaultSordingBasedOnId("Kapil",102);
		
		TreeSet<EmployeeDefaultSordingBasedOnId> employee1 = new TreeSet<EmployeeDefaultSordingBasedOnId>(new EmployeeSortingByName());
		employee1.add(emp11);
		employee1.add(emp22);
		employee1.add(emp33);
		employee1.add(emp44);
		employee1.add(emp55);
		
//		System.out.println(employee1);
		
//		===========Duplicates=====================
		TreeSet myTree = new TreeSet(new MyComparator());
		
		myTree.add(10);
		myTree.add(20);
		myTree.add(10);
		myTree.add(30);
		
		System.out.println(myTree);
	}
}
