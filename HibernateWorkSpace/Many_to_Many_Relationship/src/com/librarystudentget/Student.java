package com.librarystudentget;

import java.util.Set;

public class Student {
	private Integer sId;
	private String sName;
	private Set Books;

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
	 * @return the books
	 */
	public Set getBooks() {
		return Books;
	}

	/**
	 * @param books the books to set
	 */
	public void setBooks(Set books) {
		Books = books;
	}

}
