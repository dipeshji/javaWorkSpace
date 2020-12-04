package com.authorbookcreate;

import java.util.Set;

public class Author {
	private Integer aId;
	private String aName;
	private Set Children;

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
	 * @return the aName
	 */
	public String getaName() {
		return aName;
	}

	/**
	 * @param aName the aName to set
	 */
	public void setaName(String aName) {
		this.aName = aName;
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
