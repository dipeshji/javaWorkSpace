package com.relationships;

public class Customer {
	private String Cname;
	private Integer Cid;
	private Integer vendorId;

	/**
	 * @return the cname
	 */
	public String getCname() {
		return Cname;
	}

	/**
	 * @param cname the cname to set
	 */
	public void setCname(String cname) {
		Cname = cname;
	}

	/**
	 * @return the cid
	 */
	public Integer getCid() {
		return Cid;
	}

	/**
	 * @param cid the cid to set
	 */
	public void setCid(Integer cid) {
		Cid = cid;
	}

	public Integer getVendorId() {
		return vendorId;
	}

	public void setVendorId(Integer vendorId) {
		this.vendorId = vendorId;
	}

}
