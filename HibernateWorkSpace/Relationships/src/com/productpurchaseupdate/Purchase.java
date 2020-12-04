package com.productpurchaseupdate;

public class Purchase {
	private Integer purId;
	private String purDetails;
	private Integer fKProductId;

	/**
	 * @return the fKProductId
	 */
	public Integer getfKProductId() {
		return fKProductId;
	}

	/**
	 * @param fKProductId the fKProductId to set
	 */
	public void setfKProductId(Integer fKProductId) {
		this.fKProductId = fKProductId;
	}

	/**
	 * @return the purId
	 */
	public Integer getPurId() {
		return purId;
	}

	/**
	 * @param purId the purId to set
	 */
	public void setPurId(Integer purId) {
		this.purId = purId;
	}

	/**
	 * @return the purDetails
	 */
	public String getPurDetails() {
		return purDetails;
	}

	/**
	 * @param purDetails the purDetails to set
	 */
	public void setPurDetails(String purDetails) {
		this.purDetails = purDetails;
	}
}
