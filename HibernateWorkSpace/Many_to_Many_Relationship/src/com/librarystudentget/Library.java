package com.librarystudentget;

import java.util.Set;

public class Library {
	private Integer bId;
	private String bName;
	private Set Students;

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
	 * @return the students
	 */
	public Set getStudents() {
		return Students;
	}

	/**
	 * @param students the students to set
	 */
	public void setStudents(Set students) {
		Students = students;
	}

}
