package com.khatabook;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.customer.Customer;

@Entity
@Table(name = "khatabook")
public class Khata {

	@Id
	@Column(name = "khata_id")
	private Integer khataId;

	@Column(name = "business_name")
	private String businessName;

	@OneToMany(fetch = FetchType.LAZY, targetEntity = Customer.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "khata_id", referencedColumnName = "khata_id")
	private Set customer;

	public Integer getKhataId() {
		return khataId;
	}

	public void setKhataId(Integer khataId) {
		this.khataId = khataId;
	}

	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public Set getCustomer() {
		return customer;
	}

	public void setCustomer(Set customer) {
		this.customer = customer;
	}
}
