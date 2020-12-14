package com.citycustomerdelete;

public class City {
	private Integer dId;
	private String dName;
	private Customer parent;

	/**
	 * @return the dId
	 */
	public Integer getdId() {
		return dId;
	}

	/**
	 * @param dId the dId to set
	 */
	public void setdId(Integer dId) {
		this.dId = dId;
	}

	/**
	 * @return the dName
	 */
	public String getdName() {
		return dName;
	}

	/**
	 * @param dName the dName to set
	 */
	public void setdName(String dName) {
		this.dName = dName;
	}

	/**
	 * @return the parent
	 */
	public Customer getParent() {
		return parent;
	}

	/**
	 * @param parent the parent to set
	 */
	public void setParent(Customer parent) {
		this.parent = parent;
	}
}
