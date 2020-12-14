package com.studentaddrcreate;

public class Address {
	private Integer aId;
	private String city;
	private String state;
	private Student s;

	/**
	 * @return the aId
	 */
	public Integer getaId() {
		return aId;
	}

	/**
	 * @param aId the aId to set
	 */
	public void setaId(Integer aId) {
		this.aId = aId;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the s
	 */
	public Student getS() {
		return s;
	}

	/**
	 * @param s the s to set
	 */
	public void setS(Student s) {
		this.s = s;
	}
}
