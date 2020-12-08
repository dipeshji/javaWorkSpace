package com.teacherstudentget;

public class Student {
	private Integer sId;
	private String sName;
	private Integer FKteacherId;
	private Teacher parentObjects;

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
	 * @return the fKteacherId
	 */
	public Integer getFKteacherId() {
		return FKteacherId;
	}

	/**
	 * @param fKteacherId the fKteacherId to set
	 */
	public void setFKteacherId(Integer fKteacherId) {
		FKteacherId = fKteacherId;
	}

	/**
	 * @return the parentObjects
	 */
	public Teacher getParentObjects() {
		return parentObjects;
	}

	/**
	 * @param parentObjects the parentObjects to set
	 */
	public void setParentObjects(Teacher parentObjects) {
		this.parentObjects = parentObjects;
	}

}
