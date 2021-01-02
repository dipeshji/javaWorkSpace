package com.studetnaddresscreate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class Address {

	@Id
	@Column(name = "add_id")
	private Integer addressId;

	@Column(name = "address")
	private String address;

	@OneToOne(targetEntity = Student.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "stu_id", referencedColumnName = "sid")
	private Student parent;

	/**
	 * @return the addressId
	 */
	public Integer getAddressId() {
		return addressId;
	}

	/**
	 * @param addressId the addressId to set
	 */
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the parent
	 */
	public Student getParent() {
		return parent;
	}

	/**
	 * @param parent the parent to set
	 */
	public void setParent(Student parent) {
		this.parent = parent;
	}

}
