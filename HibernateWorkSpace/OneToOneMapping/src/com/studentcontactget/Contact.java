package com.studentcontactget;

public class Contact {
	private Integer cId;
	private String cName;
	private Student parent;

	/**
	 * @return the cId
	 */
	public Integer getcId() {
		return cId;
	}

	/**
	 * @param cId the cId to set
	 */
	public void setcId(Integer cId) {
		this.cId = cId;
	}

	/**
	 * @return the cName
	 */
	public String getcName() {
		return cName;
	}

	/**
	 * @param cName the cName to set
	 */
	public void setcName(String cName) {
		this.cName = cName;
	}

	/**
	 * @return the parent
	 */
	public Student getParent() {
		return parent;
	}

	/**
	 * @param parent the parent to set
	 */
	public void setParent(Student parent) {
		this.parent = parent;
	}
}
