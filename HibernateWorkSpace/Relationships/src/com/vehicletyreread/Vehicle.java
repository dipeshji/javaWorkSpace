package com.vehicletyreread;

import java.util.Set;

public class Vehicle {
	private Integer vId;
	private String vName;
	private Set children;

	/**
	 * @return the vId
	 */
	public Integer getvId() {
		return vId;
	}

	/**
	 * @param vId the vId to set
	 */
	public void setvId(Integer vId) {
		this.vId = vId;
	}

	/**
	 * @return the vName
	 */
	public String getvName() {
		return vName;
	}

	/**
	 * @param vName the vName to set
	 */
	public void setvName(String vName) {
		this.vName = vName;
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
