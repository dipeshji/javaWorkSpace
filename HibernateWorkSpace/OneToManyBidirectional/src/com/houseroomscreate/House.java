package com.houseroomscreate;

public class House {
	private Integer pId;
	private String pName;
	private Integer FKuserId;
	private Rooms parentObjects;

	/**
	 * @return the pId
	 */
	public Integer getpId() {
		return pId;
	}

	/**
	 * @param pId the pId to set
	 */
	public void setpId(Integer pId) {
		this.pId = pId;
	}

	/**
	 * @return the pName
	 */
	public String getpName() {
		return pName;
	}

	/**
	 * @param pName the pName to set
	 */
	public void setpName(String pName) {
		this.pName = pName;
	}

	/**
	 * @return the fKuserId
	 */
	public Integer getFKuserId() {
		return FKuserId;
	}

	/**
	 * @param fKuserId the fKuserId to set
	 */
	public void setFKuserId(Integer fKuserId) {
		FKuserId = fKuserId;
	}

	/**
	 * @return the parentObjects
	 */
	public Rooms getParentObjects() {
		return parentObjects;
	}

	/**
	 * @param parentObjects the parentObjects to set
	 */
	public void setParentObjects(Rooms parentObjects) {
		this.parentObjects = parentObjects;
	}

}
