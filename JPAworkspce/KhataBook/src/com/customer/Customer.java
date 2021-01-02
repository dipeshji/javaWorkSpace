package com.customer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Customer")
public class Customer {

	@Id
	@Column(name = "cust_id")
	private Integer customerId;

	@Column(name = "cust_name")
	private String customerName;

	@Column(name = "cust_num")
	private long customerNum;

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public long getCustomerNum() {
		return customerNum;
	}

	public void setCustomerNum(long customerNum) {
		this.customerNum = customerNum;
	}

}
