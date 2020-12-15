package com.customeraccountcreate;

import java.util.Set;

public class Customer {
	private Integer cId;
	private String cName;
	private Set items;

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
	 * @return the items
	 */
	public Set getItems() {
		return items;
	}

	/**
	 * @param items the items to set
	 */
	public void setItems(Set items) {
		this.items = items;
	}
}
