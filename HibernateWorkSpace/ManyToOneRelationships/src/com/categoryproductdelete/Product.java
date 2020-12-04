package com.categoryproductdelete;

public class Product {
	private Integer pId;
	private String pName;
	private Category parentObjects;
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
	 * @return the parentObjects
	 */
	public Category getParentObjects() {
		return parentObjects;
	}
	/**
	 * @param parentObjects the parentObjects to set
	 */
	public void setParentObjects(Category parentObjects) {
		this.parentObjects = parentObjects;
	}

	
}
