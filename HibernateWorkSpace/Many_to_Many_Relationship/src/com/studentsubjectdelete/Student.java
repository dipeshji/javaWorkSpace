package com.studentsubjectdelete;

import java.util.Set;

public class Student {
	private Integer oId;
	private String oName;
	private Set products;

	/**
	 * @return the oId
	 */
	public Integer getoId() {
		return oId;
	}

	/**
	 * @param oId the oId to set
	 */
	public void setoId(Integer oId) {
		this.oId = oId;
	}

	/**
	 * @return the oName
	 */
	public String getoName() {
		return oName;
	}

	/**
	 * @param oName the oName to set
	 */
	public void setoName(String oName) {
		this.oName = oName;
	}

	/**
	 * @return the products
	 */
	public Set getProducts() {
		return products;
	}

	/**
	 * @param products the products to set
	 */
	public void setProducts(Set products) {
		this.products = products;
	}

}
