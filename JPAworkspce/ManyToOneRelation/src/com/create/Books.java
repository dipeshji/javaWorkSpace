package com.create;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "books")
public class Books {

	@Id
	@Column(name = "b_id")
	private Integer bookId;

	@Column(name = "b_name")
	private String bookName;

	@ManyToOne(targetEntity = Author.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "author_id", referencedColumnName = "a_id")
	private Author parentObjects;

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Author getParentObjects() {
		return parentObjects;
	}

	public void setParentObjects(Author parentObjects) {
		this.parentObjects = parentObjects;
	}
}
