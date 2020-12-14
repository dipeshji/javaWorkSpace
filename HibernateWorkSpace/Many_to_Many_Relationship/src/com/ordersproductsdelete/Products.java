package com.ordersproductsdelete;

import java.util.Set;

public class Products {
	private Integer pId;
	private String pName;
	private Set Orders;

	/**
	 * @return the pId
	 */
	public Integer getpId() {
		return pId;
	}

	/**
	 * @param pId the pId to set
	 */
	public void setpId(Integer pId) {
		this.pId = pId;
	}

	/**
	 * @return the pName
	 */
	public String getpName() {
		return pName;
	}

	/**
	 * @param pName the pName to set
	 */
	public void setpName(String pName) {
		this.pName = pName;
	}

	/**
	 * @return the orders
	 */
	public Set getOrders() {
		return Orders;
	}

	/**
	 * @param orders the orders to set
	 */
	public void setOrders(Set orders) {
		Orders = orders;
	}

}
