package com.peoplelicenseupdate;

public class License {
	private Integer lId;
	private Integer lNum;
	private People parent;

	/**
	 * @return the lId
	 */
	public Integer getlId() {
		return lId;
	}

	/**
	 * @param lId the lId to set
	 */
	public void setlId(Integer lId) {
		this.lId = lId;
	}

	/**
	 * @return the lNum
	 */
	public Integer getlNum() {
		return lNum;
	}

	/**
	 * @param lNum the lNum to set
	 */
	public void setlNum(Integer lNum) {
		this.lNum = lNum;
	}

	/**
	 * @return the parent
	 */
	public People getParent() {
		return parent;
	}

	/**
	 * @param parent the parent to set
	 */
	public void setParent(People parent) {
		this.parent = parent;
	}
}
