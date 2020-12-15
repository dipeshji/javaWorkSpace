package com.customeraccountcreate;

import java.util.Set;

public class Account {
	private Integer iId;
	private String iName;
	private Set cart;

	/**
	 * @return the iId
	 */
	public Integer getiId() {
		return iId;
	}

	/**
	 * @param iId the iId to set
	 */
	public void setiId(Integer iId) {
		this.iId = iId;
	}

	/**
	 * @return the iName
	 */
	public String getiName() {
		return iName;
	}

	/**
	 * @param iName the iName to set
	 */
	public void setiName(String iName) {
		this.iName = iName;
	}

	/**
	 * @return the cart
	 */
	public Set getCart() {
		return cart;
	}

	/**
	 * @param cart the cart to set
	 */
	public void setCart(Set cart) {
		this.cart = cart;
	}
}
