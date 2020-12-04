package com.countrystatesave;

public class State {
	private Integer sId;
	private String sName;
	private Country parentObjects;

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
	 * @return the parentObjects
	 */
	public Country getParentObjects() {
		return parentObjects;
	}

	/**
	 * @param parentObjects the parentObjects to set
	 */
	public void setParentObjects(Country parentObjects) {
		this.parentObjects = parentObjects;
	}
}
