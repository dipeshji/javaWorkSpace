package com.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "login")
public class User {
	@Id
	@Column(name = "userId")
	private Integer userId;

	@Column(name = "number")
	private Integer moNumber;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getMoNumber() {
		return moNumber;
	}

	public void setMoNumber(Integer moNumber) {
		this.moNumber = moNumber;
	}
}
