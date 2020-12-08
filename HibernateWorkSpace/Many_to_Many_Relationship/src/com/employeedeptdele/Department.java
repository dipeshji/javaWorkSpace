package com.employeedeptdele;

import java.util.Set;

public class Department {
	private Integer dId;
	private String dName;
	private Set employees;

	/**
	 * @return the dId
	 */
	public Integer getdId() {
		return dId;
	}

	/**
	 * @param dId the dId to set
	 */
	public void setdId(Integer dId) {
		this.dId = dId;
	}

	/**
	 * @return the dName
	 */
	public String getdName() {
		return dName;
	}

	/**
	 * @param dName the dName to set
	 */
	public void setdName(String dName) {
		this.dName = dName;
	}

	/**
	 * @return the employees
	 */
	public Set getEmployees() {
		return employees;
	}

	/**
	 * @param employees the employees to set
	 */
	public void setEmployees(Set employees) {
		this.employees = employees;
	}
}
