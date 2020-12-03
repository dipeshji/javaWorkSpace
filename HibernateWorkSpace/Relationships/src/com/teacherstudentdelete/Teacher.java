package com.teacherstudentdelete;

import java.util.Set;

public class Teacher {
	private Integer teaId;
	private String teaName;
	private Set children;

	/**
	 * @return the teaId
	 */
	public Integer getTeaId() {
		return teaId;
	}

	/**
	 * @param teaId the teaId to set
	 */
	public void setTeaId(Integer teaId) {
		this.teaId = teaId;
	}

	/**
	 * @return the teaName
	 */
	public String getTeaName() {
		return teaName;
	}

	/**
	 * @param teaName the teaName to set
	 */
	public void setTeaName(String teaName) {
		this.teaName = teaName;
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
