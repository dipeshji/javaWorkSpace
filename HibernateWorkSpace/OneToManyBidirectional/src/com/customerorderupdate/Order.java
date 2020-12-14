package com.customerorderupdate;

public class Order {
	private Integer oId;
	private String oItem;
	private Integer FKCustId;
	private Customer parentObjects;

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
	 * @return the oItem
	 */
	public String getoItem() {
		return oItem;
	}

	/**
	 * @param oItem the oItem to set
	 */
	public void setoItem(String oItem) {
		this.oItem = oItem;
	}

	/**
	 * @return the fKCustId
	 */
	public Integer getFKCustId() {
		return FKCustId;
	}

	/**
	 * @param fKCustId the fKCustId to set
	 */
	public void setFKCustId(Integer fKCustId) {
		FKCustId = fKCustId;
	}

	/**
	 * @return the parentObjects
	 */
	public Customer getParentObjects() {
		return parentObjects;
	}

	/**
	 * @param parentObjects the parentObjects to set
	 */
	public void setParentObjects(Customer parentObjects) {
		this.parentObjects = parentObjects;
	}

}
