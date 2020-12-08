package com.interviewrsapplicantdelete;

public class Interviewrs {
	private Integer intId;
	private String intName;
	private Integer FKaplicId;
	private Applicant parentObjects;

	/**
	 * @return the intId
	 */
	public Integer getIntId() {
		return intId;
	}

	/**
	 * @param intId the intId to set
	 */
	public void setIntId(Integer intId) {
		this.intId = intId;
	}

	/**
	 * @return the intName
	 */
	public String getIntName() {
		return intName;
	}

	/**
	 * @param intName the intName to set
	 */
	public void setIntName(String intName) {
		this.intName = intName;
	}

	/**
	 * @return the fKaplicId
	 */
	public Integer getFKaplicId() {
		return FKaplicId;
	}

	/**
	 * @param fKaplicId the fKaplicId to set
	 */
	public void setFKaplicId(Integer fKaplicId) {
		FKaplicId = fKaplicId;
	}

	/**
	 * @return the parentObjects
	 */
	public Applicant getParentObjects() {
		return parentObjects;
	}

	/**
	 * @param parentObjects the parentObjects to set
	 */
	public void setParentObjects(Applicant parentObjects) {
		this.parentObjects = parentObjects;
	}
}
