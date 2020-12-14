package com.parentchildget;

public class Child {
	private Integer cId;
	private String cName;
	private Integer FKarentId;
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
	 * @return the fKarentId
	 */
	public Integer getFKarentId() {
		return FKarentId;
	}

	/**
	 * @param fKarentId the fKarentId to set
	 */
	public void setFKarentId(Integer fKarentId) {
		FKarentId = fKarentId;
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
