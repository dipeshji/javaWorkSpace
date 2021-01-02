package com.categoryitemupdate;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Table(name = "categories")
public class Category {
	@Id
	@Column(name = "c_id")
	private Integer columnId;

	@Column(name = "c_name")
	private String categoryName;

	@ManyToMany(targetEntity = Item.class, cascade = CascadeType.ALL)
	@JoinTable(name = "categories_items", joinColumns = @JoinColumn(name = "cat_id_fk", referencedColumnName = "c_id"), inverseJoinColumns = @JoinColumn(name = "item_id_fk", referencedColumnName = "i_id"))
	private Set<Item> items;

	/**
	 * @return the columnId
	 */
	public Integer getColumnId() {
		return columnId;
	}

	/**
	 * @param columnId the columnId to set
	 */
	public void setColumnId(Integer columnId) {
		this.columnId = columnId;
	}

	/**
	 * @return the categoryName
	 */
	public String getCategoryName() {
		return categoryName;
	}

	/**
	 * @param categoryName the categoryName to set
	 */
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	/**
	 * @return the items
	 */
	public Set<Item> getItems() {
		return items;
	}

	/**
	 * @param items the items to set
	 */
	public void setItems(Set<Item> items) {
		this.items = items;
	}

}
