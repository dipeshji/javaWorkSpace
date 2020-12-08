package com.universitycollegecreate;

public class College {
	private Integer cId;
	private String cName;
	private Integer FKuniversityId;
	private University parentObjects;

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
	 * @return the fKuniversityId
	 */
	public Integer getFKuniversityId() {
		return FKuniversityId;
	}

	/**
	 * @param fKuniversityId the fKuniversityId to set
	 */
	public void setFKuniversityId(Integer fKuniversityId) {
		FKuniversityId = fKuniversityId;
	}

	/**
	 * @return the parentObjects
	 */
	public University getParentObjects() {
		return parentObjects;
	}

	/**
	 * @param parentObjects the parentObjects to set
	 */
	public void setParentObjects(University parentObjects) {
		this.parentObjects = parentObjects;
	}
}
