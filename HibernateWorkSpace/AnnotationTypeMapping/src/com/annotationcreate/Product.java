package com.annotationcreate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {

	@Id
	@Column(name = "prod_id")
	private Integer productID;

	@Column(name = "proname", length = 20)
	private String proName;

	@Column(name = "price")
	private double price;

	/**
	 * @return the productID
	 */
	public Integer getProductID() {
		return productID;
	}

	/**
	 * @param productID the productID to set
	 */
	public void setProductID(Integer productID) {
		this.productID = productID;
	}

	/**
	 * @return the proName
	 */
	public String getProName() {
		return proName;
	}

	/**
	 * @param proName the proName to set
	 */
	public void setProName(String proName) {
		this.proName = proName;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

}
