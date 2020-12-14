package com.employeetodoupdate;

import java.util.Set;

public class Employee {
	private Integer eId;
	private String eName;
	private Set children;

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
	 * @return the children
	 */
	public Set getChildren() {
		return children;
	}

	/**
	 * @param children the children to set
	 */
	public void setChildren(Set children) {
		this.children = children;
	}

}
