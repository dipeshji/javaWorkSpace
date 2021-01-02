package com.cartitemdelete;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;

@Entity
@Table(name = "cart")
public class Cart {
	@Id
	@Column(name = "c_id")
	private Integer cartId;

	@Column(name = "c_name")
	private String cartName;

	@ManyToMany(targetEntity = Item.class, cascade = CascadeType.ALL)
	@JoinTable(name = "carts_items", joinColumns = @JoinColumn(name = "c_id_fk", referencedColumnName = "c_id"), inverseJoinColumns = @JoinColumn(name = "i_id_fk", referencedColumnName = "i_id"))
	private Set items;

	/**
	 * @return the cartId
	 */
	public Integer getCartId() {
		return cartId;
	}

	/**
	 * @param cartId the cartId to set
	 */
	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}

	/**
	 * @return the cartName
	 */
	public String getCartName() {
		return cartName;
	}

	/**
	 * @param cartName the cartName to set
	 */
	public void setCartName(String cartName) {
		this.cartName = cartName;
	}

	/**
	 * @return the items
	 */
	public Set getItems() {
		return items;
	}

	/**
	 * @param items the items to set
	 */
	public void setItems(Set items) {
		this.items = items;
	}
}
