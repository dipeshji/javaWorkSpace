package com.houseroomscreate;

import java.util.Set;

public class Rooms {
	private Integer lId;
	private String lName;
	private Set Children;

	/**
	 * @return the lId
	 */
	public Integer getlId() {
		return lId;
	}

	/**
	 * @param lId the lId to set
	 */
	public void setlId(Integer lId) {
		this.lId = lId;
	}

	/**
	 * @return the lName
	 */
	public String getlName() {
		return lName;
	}

	/**
	 * @param lName the lName to set
	 */
	public void setlName(String lName) {
		this.lName = lName;
	}

	/**
	 * @return the children
	 */
	public Set getChildren() {
		return Children;
	}

	/**
	 * @param children the children to set
	 */
	public void setChildren(Set children) {
		Children = children;
	}

}
