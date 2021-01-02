package com.transections;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "transections")
public class Transections {

	@Id
	@Column(name = "tx_id")
	private Integer transectionId;

	@Column(name = "cust_name")
	private String customerName;

	@Column(name = "busi_name")
	private String businessName;

	@Column(name = "cust_id")
	private Integer customerId;

	@Column(name = "busi_id")
	private Integer businessId;

	@Column(name = "tx_type")
	private String transectionType;

	public Integer getTransectionId() {
		return transectionId;
	}

	public void setTransectionId(Integer transectionId) {
		this.transectionId = transectionId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Integer getBusinessId() {
		return businessId;
	}

	public void setBusinessId(Integer businessId) {
		this.businessId = businessId;
	}

	public String getTransectionType() {
		return transectionType;
	}

	public void setTransectionType(String transectionType) {
		this.transectionType = transectionType;
	}
}
