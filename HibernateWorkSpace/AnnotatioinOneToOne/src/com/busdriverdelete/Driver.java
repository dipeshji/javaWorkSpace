package com.busdriverdelete;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "driver")
public class Driver {
	@Id
	@Column(name = "d_id")
	private Integer driverId;

	@Column(name = "d_name")
	private String driverName;

	/**
	 * @return the driverId
	 */
	public Integer getDriverId() {
		return driverId;
	}

	/**
	 * @param driverId the driverId to set
	 */
	public void setDriverId(Integer driverId) {
		this.driverId = driverId;
	}

	/**
	 * @return the driverName
	 */
	public String getDriverName() {
		return driverName;
	}

	/**
	 * @param driverName the driverName to set
	 */
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

}
