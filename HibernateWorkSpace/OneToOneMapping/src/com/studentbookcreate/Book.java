package com.studentbookcreate;

public class Book {
	private Integer bId;
	private String bName;
	private Student parent;

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
	 * @return the parent
	 */
	public Student getParent() {
		return parent;
	}

	/**
	 * @param parent the parent to set
	 */
	public void setParent(Student parent) {
		this.parent = parent;
	}
}
