package OopsBasics;

public class Employee {
	int id;
	String firstName;
	String lastName;
	int salary;
	
	
	public Employee(int id, String firstName, String lastName, int salary) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	public int getAnnualSalary() {
		return salary*12;
	}
	
	public int raiseSalary(int percent){
		return salary += (salary/100)*percent;
	}
	
	public String toString() {
		return "id: " + id + " | First Name: " + firstName + " | Last Name: " + lastName + " | salary: " + salary;
	}
	
}
