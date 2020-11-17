package OopsBasics;

public class Author {
	String name;
	String email;
	char gender;
	
	Author(){}
	
	Author(String name, String email, char gender){
		this.name = name;
		this.email = email;
		this.gender = gender;
		System.out.println("Author");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "Author" + "[" + "Name= " + this.name + " Email= " + this.email + " Gender= " + this.gender + "]";
	}
	
}
