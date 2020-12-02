package com.studentproject;

import java.util.Set;

public class Project {
	private String projectName;
	private Integer projectId;
	private Set Children;

	/**
	 * @return the projectName
	 */
	public String getProjectName() {
		return projectName;
	}

	/**
	 * @param projectName the projectName to set
	 */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	/**
	 * @return the projectId
	 */
	public Integer getProjectId() {
		return projectId;
	}

	/**
	 * @param projectId the projectId to set
	 */
	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	/**
	 * @return the children
	 */
	public Set getChildren() {
		return Children;
	}

	/**
	 * @param children the children to set
	 */
	public void setChildren(Set children) {
		Children = children;
	}

}
