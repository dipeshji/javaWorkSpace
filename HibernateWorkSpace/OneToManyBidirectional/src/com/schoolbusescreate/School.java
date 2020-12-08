package com.schoolbusescreate;

import java.util.Set;

public class School {
	private Integer sId;
	private String sName;
	private Set children;

	/**
	 * @return the sId
	 */
	public Integer getsId() {
		return sId;
	}

	/**
	 * @param sId the sId to set
	 */
	public void setsId(Integer sId) {
		this.sId = sId;
	}

	/**
	 * @return the sName
	 */
	public String getsName() {
		return sName;
	}

	/**
	 * @param sName the sName to set
	 */
	public void setsName(String sName) {
		this.sName = sName;
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
