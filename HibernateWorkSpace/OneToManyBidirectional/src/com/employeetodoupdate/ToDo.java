package com.employeetodoupdate;

public class ToDo {
	private Integer tId;
	private String tTask;
	private Integer FKEmpId;
	private Employee parentObjects;

	/**
	 * @return the tId
	 */
	public Integer gettId() {
		return tId;
	}

	/**
	 * @param tId the tId to set
	 */
	public void settId(Integer tId) {
		this.tId = tId;
	}

	/**
	 * @return the tTask
	 */
	public String gettTask() {
		return tTask;
	}

	/**
	 * @param tTask the tTask to set
	 */
	public void settTask(String tTask) {
		this.tTask = tTask;
	}

	/**
	 * @return the fKEmpId
	 */
	public Integer getFKEmpId() {
		return FKEmpId;
	}

	/**
	 * @param fKEmpId the fKEmpId to set
	 */
	public void setFKEmpId(Integer fKEmpId) {
		FKEmpId = fKEmpId;
	}

	/**
	 * @return the parentObjects
	 */
	public Employee getParentObjects() {
		return parentObjects;
	}

	/**
	 * @param parentObjects the parentObjects to set
	 */
	public void setParentObjects(Employee parentObjects) {
		this.parentObjects = parentObjects;
	}

}
