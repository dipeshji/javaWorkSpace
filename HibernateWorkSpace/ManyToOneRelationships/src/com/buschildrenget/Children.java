package com.buschildrenget;

public class Children {
	private Integer cId;
	private String cName;
	private Bus parentObjects;

	/**
	 * @return the parentObjects
	 */
	public Bus getParentObjects() {
		return parentObjects;
	}

	/**
	 * @param parentObjects the parentObjects to set
	 */
	public void setParentObjects(Bus parentObjects) {
		this.parentObjects = parentObjects;
	}

	/**
	 * @return the cId
	 */
	public Integer getcId() {
		return cId;
	}

	/**
	 * @param cId the cId to set
	 */
	public void setcId(Integer cId) {
		this.cId = cId;
	}

	/**
	 * @return the cName
	 */
	public String getcName() {
		return cName;
	}

	/**
	 * @param cName the cName to set
	 */
	public void setcName(String cName) {
		this.cName = cName;
	}
}
