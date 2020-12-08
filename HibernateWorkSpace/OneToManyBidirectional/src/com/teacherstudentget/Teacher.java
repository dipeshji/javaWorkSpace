package com.teacherstudentget;

import java.util.Set;

public class Teacher {
	private Integer tId;
	private String tName;
	private Set children;

	/**
	 * @return the tId
	 */
	public Integer gettId() {
		return tId;
	}

	/**
	 * @param tId the tId to set
	 */
	public void settId(Integer tId) {
		this.tId = tId;
	}

	/**
	 * @return the tName
	 */
	public String gettName() {
		return tName;
	}

	/**
	 * @param tName the tName to set
	 */
	public void settName(String tName) {
		this.tName = tName;
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
