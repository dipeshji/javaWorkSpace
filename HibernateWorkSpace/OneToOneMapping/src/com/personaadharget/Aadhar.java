package com.personaadharget;

public class Aadhar {
	private Integer pId;
	private Integer pNo;
	private Person parent;

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
	 * @return the pNo
	 */
	public Integer getpNo() {
		return pNo;
	}

	/**
	 * @param pNo the pNo to set
	 */
	public void setpNo(Integer pNo) {
		this.pNo = pNo;
	}

	/**
	 * @return the parent
	 */
	public Person getParent() {
		return parent;
	}

	/**
	 * @param parent the parent to set
	 */
	public void setParent(Person parent) {
		this.parent = parent;
	}
}
