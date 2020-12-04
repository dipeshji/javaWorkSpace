package com.districttehsilget;

public class Thesil {
	private Integer tId;
	private String tName;
	private District parentObjects;

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
	 * @return the parentObjects
	 */
	public District getParentObjects() {
		return parentObjects;
	}

	/**
	 * @param parentObjects the parentObjects to set
	 */
	public void setParentObjects(District parentObjects) {
		this.parentObjects = parentObjects;
	}

}
