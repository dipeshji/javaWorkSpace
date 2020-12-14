package com.employeeaddressupdate;

public class Address {
	private Integer tId;
	private String tName;
	private int fKprincipleId;

	/**
	 * @return the fKprincipleId
	 */
	public int getfKprincipleId() {
		return fKprincipleId;
	}

	/**
	 * @param fKprincipleId the fKprincipleId to set
	 */
	public void setfKprincipleId(int fKprincipleId) {
		this.fKprincipleId = fKprincipleId;
	}

	/**
	 * @return the tId
	 */
	public Integer gettId() {
		return tId;
	}

	/**
	 * @param tId the tId to set
	 */
	public void settId(Integer tId) {
		this.tId = tId;
	}

	/**
	 * @return the tName
	 */
	public String gettName() {
		return tName;
	}

	/**
	 * @param tName the tName to set
	 */
	public void settName(String tName) {
		this.tName = tName;
	}

}
