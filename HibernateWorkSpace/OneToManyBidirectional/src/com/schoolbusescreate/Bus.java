package com.schoolbusescreate;

import java.util.Set;

public class Bus {
	private Integer bId;
	private String bName;
	private Integer FKschoolId;
	private School parentObjects;

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
	 * @return the fKschoolId
	 */
	public Integer getFKschoolId() {
		return FKschoolId;
	}

	/**
	 * @param fKschoolId the fKschoolId to set
	 */
	public void setFKschoolId(Integer fKschoolId) {
		FKschoolId = fKschoolId;
	}

	/**
	 * @return the parentObjects
	 */
	public School getParentObjects() {
		return parentObjects;
	}

	/**
	 * @param parentObjects the parentObjects to set
	 */
	public void setParentObjects(School parentObjects) {
		this.parentObjects = parentObjects;
	}

}
