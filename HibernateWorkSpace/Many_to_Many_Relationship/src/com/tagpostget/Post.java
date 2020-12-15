package com.tagpostget;

import java.util.Set;

public class Post {
	private Integer eId;
	private String eName;
	private Set projects;

	/**
	 * @return the eId
	 */
	public Integer geteId() {
		return eId;
	}

	/**
	 * @param eId the eId to set
	 */
	public void seteId(Integer eId) {
		this.eId = eId;
	}

	/**
	 * @return the eName
	 */
	public String geteName() {
		return eName;
	}

	/**
	 * @param eName the eName to set
	 */
	public void seteName(String eName) {
		this.eName = eName;
	}

	/**
	 * @return the projects
	 */
	public Set getProjects() {
		return projects;
	}

	/**
	 * @param projects the projects to set
	 */
	public void setProjects(Set projects) {
		this.projects = projects;
	}
}
