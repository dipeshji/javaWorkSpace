package com.interviewrsapplicantdelete;

import java.util.Set;

public class Applicant {
	private Integer apliId;
	private String apliName;
	private Set children;

	/**
	 * @return the apliId
	 */
	public Integer getApliId() {
		return apliId;
	}

	/**
	 * @param apliId the apliId to set
	 */
	public void setApliId(Integer apliId) {
		this.apliId = apliId;
	}

	/**
	 * @return the apliName
	 */
	public String getApliName() {
		return apliName;
	}

	/**
	 * @param apliName the apliName to set
	 */
	public void setApliName(String apliName) {
		this.apliName = apliName;
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
