package com.companymodelsupdate;

public class Models {
	private Integer mId;
	private String mName;
	private Integer fKCompanyId;

	/**
	 * @return the fKCompanyId
	 */
	public Integer getfKCompanyId() {
		return fKCompanyId;
	}

	/**
	 * @param fKCompanyId the fKCompanyId to set
	 */
	public void setfKCompanyId(Integer fKCompanyId) {
		this.fKCompanyId = fKCompanyId;
	}

	/**
	 * @return the mId
	 */
	public Integer getmId() {
		return mId;
	}

	/**
	 * @param mId the mId to set
	 */
	public void setmId(Integer mId) {
		this.mId = mId;
	}

	/**
	 * @return the mName
	 */
	public String getmName() {
		return mName;
	}

	/**
	 * @param mName the mName to set
	 */
	public void setmName(String mName) {
		this.mName = mName;
	}
}
