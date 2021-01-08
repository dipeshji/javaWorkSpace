package com.codejava.hibernate;
// Generated 04-Jan-2021, 12:46:58 pm by Hibernate Tools 5.2.12.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Student generated by hbm2java
 */
@Entity
@Table(name = "student", catalog = "classicmodels")
public class Student implements java.io.Serializable {

	private int studentId;
	private Integer SAge;
	private String SName;
	private String SAddress;

	public Student() {
	}

	public Student(int studentId) {
		this.studentId = studentId;
	}

	public Student(int studentId, Integer SAge, String SName, String SAddress) {
		this.studentId = studentId;
		this.SAge = SAge;
		this.SName = SName;
		this.SAddress = SAddress;
	}

	@Id

	@Column(name = "student_id", unique = true, nullable = false)
	public int getStudentId() {
		return this.studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	@Column(name = "s_age")
	public Integer getSAge() {
		return this.SAge;
	}

	public void setSAge(Integer SAge) {
		this.SAge = SAge;
	}

	@Column(name = "s_name", length = 30)
	public String getSName() {
		return this.SName;
	}

	public void setSName(String SName) {
		this.SName = SName;
	}

	@Column(name = "s_address", length = 30)
	public String getSAddress() {
		return this.SAddress;
	}

	public void setSAddress(String SAddress) {
		this.SAddress = SAddress;
	}

}