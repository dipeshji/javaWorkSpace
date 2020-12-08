package com.authorbookupdate;

import java.util.Set;

public class Author {
	private Integer aId;
	private String aName;
	private Set Books;

	/**
	 * @return the aId
	 */
	public Integer getaId() {
		return aId;
	}

	/**
	 * @param aId the aId to set
	 */
	public void setaId(Integer aId) {
		this.aId = aId;
	}

	/**
	 * @return the aName
	 */
	public String getaName() {
		return aName;
	}

	/**
	 * @param aName the aName to set
	 */
	public void setaName(String aName) {
		this.aName = aName;
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
