package OopsBasics;

public class Student extends Person{
	private String program;
	private int year;
	private double fee;
	
	Student(String name, String address, String program, int year, double fee){
		setName(name);
		setAddress(address);
		this.program = program;
		this.year = year;
		this.fee = fee;
		
	}

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	@Override
	public String toString() {
		return "Student" + "[" + "name=" + getName()+ "address=" + getAddress() + "]" +"program=" + program + ", year=" + year + ", fee=" + fee + "]";
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}
}
