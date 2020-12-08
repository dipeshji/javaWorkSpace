package com.universitycollegecreate;

import java.util.Set;

public class University {
	private Integer uId;
	private String uName;
	private Set children;

	/**
	 * @return the uId
	 */
	public Integer getuId() {
		return uId;
	}

	/**
	 * @param uId the uId to set
	 */
	public void setuId(Integer uId) {
		this.uId = uId;
	}

	/**
	 * @return the uName
	 */
	public String getuName() {
		return uName;
	}

	/**
	 * @param uName the uName to set
	 */
	public void setuName(String uName) {
		this.uName = uName;
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
