package com.employeedeptdele;

import java.util.Set;

public class Employee {
	private Integer eId;
	private String eName;
	private Set departments;

	/**
	 * @return the eId
	 */
	public Integer geteId() {
		return eId;
	}

	/**
	 * @param eId the eId to set
	 */
	public void seteId(Integer eId) {
		this.eId = eId;
	}

	/**
	 * @return the eName
	 */
	public String geteName() {
		return eName;
	}

	/**
	 * @param eName the eName to set
	 */
	public void seteName(String eName) {
		this.eName = eName;
	}

	/**
	 * @return the departments
	 */
	public Set getDepartments() {
		return departments;
	}

	/**
	 * @param departments the departments to set
	 */
	public void setDepartments(Set departments) {
		this.departments = departments;
	}
}
