package com.annotations;

@JsonSerializable
public class Person {
	@JsonElement
	private String firstName;

	@JsonElement
	private String lastName;

	@JsonElement(key = "personAge")
	private String age;

	@JsonElement
	private String address;

//	this method we want to call before we convert to JSON string
	@Init
	private void initNames() {
		this.firstName = this.firstName.substring(0, 1).toUpperCase() + this.firstName.substring(1);
		this.lastName = this.lastName.substring(0, 1).toUpperCase() + this.lastName.substring(1)
				+ this.lastName.substring(1);
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the age
	 */
	public String getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(String age) {
		this.age = age;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
}
