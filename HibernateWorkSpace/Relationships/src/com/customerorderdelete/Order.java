package com.customerorderdelete;

public class Order {
	private Integer oId;
	private String oName;

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
}
