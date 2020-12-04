package com.bagbookdelete;

public class Book {
	private Integer bId;
	private String bName;
	private Bag parentObjects;

	/**
	 * @return the bId
	 */
	public Integer getbId() {
		return bId;
	}

	/**
	 * @param bId the bId to set
	 */
	public void setbId(Integer bId) {
		this.bId = bId;
	}

	/**
	 * @return the bName
	 */
	public String getbName() {
		return bName;
	}

	/**
	 * @param bName the bName to set
	 */
	public void setbName(String bName) {
		this.bName = bName;
	}

	/**
	 * @return the parentObjects
	 */
	public Bag getParentObjects() {
		return parentObjects;
	}

	/**
	 * @param parentObjects the parentObjects to set
	 */
	public void setParentObjects(Bag parentObjects) {
		this.parentObjects = parentObjects;
	}
}
