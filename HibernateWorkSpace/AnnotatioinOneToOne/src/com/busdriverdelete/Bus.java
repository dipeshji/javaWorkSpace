package com.busdriverdelete;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.CascadeType;

@Entity
@Table(name = "bus")
public class Bus {
	@Id
	@Column(name = "b_id")
	private Integer busId;

	@Column(name = "b_name")
	private String busName;

	@OneToOne(targetEntity = Driver.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "d_id", referencedColumnName = "d_id")
	private Driver parent;

	/**
	 * @return the busId
	 */
	public Integer getBusId() {
		return busId;
	}

	/**
	 * @param busId the busId to set
	 */
	public void setBusId(Integer busId) {
		this.busId = busId;
	}

	/**
	 * @return the busName
	 */
	public String getBusName() {
		return busName;
	}

	/**
	 * @param busName the busName to set
	 */
	public void setBusName(String busName) {
		this.busName = busName;
	}

	/**
	 * @return the parent
	 */
	public Driver getParent() {
		return parent;
	}

	/**
	 * @param parent the parent to set
	 */
	public void setParent(Driver parent) {
		this.parent = parent;
	}

	
}
