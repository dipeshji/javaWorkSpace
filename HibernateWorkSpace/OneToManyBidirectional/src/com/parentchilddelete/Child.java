package com.parentchilddelete;

public class Child {
	private Integer cId;
	private String cName;
	private Integer FKparent_id;
	private Parent parentObjects;

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

	/**
	 * @return the fKparent_id
	 */
	public Integer getFKparent_id() {
		return FKparent_id;
	}

	/**
	 * @param fKparent_id the fKparent_id to set
	 */
	public void setFKparent_id(Integer fKparent_id) {
		FKparent_id = fKparent_id;
	}

	/**
	 * @return the parentObjects
	 */
	public Parent getParentObjects() {
		return parentObjects;
	}

	/**
	 * @param parentObjects the parentObjects to set
	 */
	public void setParentObjects(Parent parentObjects) {
		this.parentObjects = parentObjects;
	}
}
