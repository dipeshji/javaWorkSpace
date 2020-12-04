package com.productpurchaseupdate;

import java.util.Set;

public class Product {
	private Integer prId;
	private String prName;
	private Set children;

	/**
	 * @return the prId
	 */
	public Integer getPrId() {
		return prId;
	}

	/**
	 * @param prId the prId to set
	 */
	public void setPrId(Integer prId) {
		this.prId = prId;
	}

	/**
	 * @return the prName
	 */
	public String getPrName() {
		return prName;
	}

	/**
	 * @param prName the prName to set
	 */
	public void setPrName(String prName) {
		this.prName = prName;
	}

	/**
	 * @return the children
	 */
	public Set getChildren() {
		return children;
	}

	/**
	 * @param children the children to set
	 */
	public void setChildren(Set children) {
		this.children = children;
	}
}
