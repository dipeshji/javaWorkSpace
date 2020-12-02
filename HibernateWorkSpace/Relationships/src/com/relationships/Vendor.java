package com.relationships;

import java.util.Set;

public class Vendor {
	private Integer Vid;
	private String Vname;
	private Set Children;

	/**
	 * @return the vid
	 */
	public Integer getVid() {
		return Vid;
	}

	/**
	 * @param vid the vid to set
	 */
	public void setVid(Integer vid) {
		Vid = vid;
	}

	/**
	 * @return the vname
	 */
	public String getVname() {
		return Vname;
	}

	/**
	 * @param vname the vname to set
	 */
	public void setVname(String vname) {
		Vname = vname;
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
