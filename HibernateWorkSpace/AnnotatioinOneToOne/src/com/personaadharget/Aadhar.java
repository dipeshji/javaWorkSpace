package com.personaadharget;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.CascadeType;

@Entity
@Table(name = "aadhar")
public class Aadhar {
	@Id
	@Column
	private Integer aadharId;

	@Column(name = "c_name")
	private String countryName;

	@OneToOne(targetEntity = Person.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "p_id", referencedColumnName = "p_id")
	private Person parent;

	/**
	 * @return the aadharId
	 */
	public Integer getAadharId() {
		return aadharId;
	}

	/**
	 * @param aadharId the aadharId to set
	 */
	public void setAadharId(Integer aadharId) {
		this.aadharId = aadharId;
	}

	/**
	 * @return the countryName
	 */
	public String getCountryName() {
		return countryName;
	}

	/**
	 * @param countryName the countryName to set
	 */
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	/**
	 * @return the parent
	 */
	public Person getParent() {
		return parent;
	}

	/**
	 * @param parent the parent to set
	 */
	public void setParent(Person parent) {
		this.parent = parent;
	}

}
