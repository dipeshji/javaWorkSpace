package com.applyjob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "applicants")
public class ApplyForm {

	@Id
	@Column(name = "appl_id")
	private Integer applicatnId;

	@Column(name = "appl_first_name")
	private String applicantFirstName;

	@Column(name = "appl_last_name")
	private String applicatnLastName;

	@Column(name = "appl_email")
	private String applicantEmail;

	@Column(name = "appl_number")
	private long applicantNumber;
//private byte[] resume;

	public Integer getApplicatnId() {
		return applicatnId;
	}

	public void setApplicatnId(Integer applicatnId) {
		this.applicatnId = applicatnId;
	}

	public String getApplicantFirstName() {
		return applicantFirstName;
	}

	public void setApplicantFirstName(String applicantFirstName) {
		this.applicantFirstName = applicantFirstName;
	}

	public String getApplicatnLastName() {
		return applicatnLastName;
	}

	public void setApplicatnLastName(String applicatnLastName) {
		this.applicatnLastName = applicatnLastName;
	}

	public String getApplicantEmail() {
		return applicantEmail;
	}

	public void setApplicantEmail(String applicantEmail) {
		this.applicantEmail = applicantEmail;
	}

	public long getApplicantNumber() {
		return applicantNumber;
	}

	public void setApplicantNumber(long applicantNumber) {
		this.applicantNumber = applicantNumber;
	}
}
