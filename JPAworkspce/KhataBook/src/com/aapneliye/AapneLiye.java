package com.aapneliye;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.transections.Transections;

import java.util.Date;

@Entity
@Table(name = "aapneliye")
public class AapneLiye {

	@Id
	@Column(name = "liye_id")
	private Integer liyeId;

	@Column(name = "liye")
	private Integer liye;

	@Column(name = "details")
	private String details;

//	@Column(name = "image")
//	private byte[] image;

	@Column(name = "date")
	private Date date;

	@ManyToOne(targetEntity = Transections.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "tx_id", referencedColumnName = "tx_id")
	private Transections transections;

	public Integer getLiyeId() {
		return liyeId;
	}

	public void setLiyeId(Integer liyeId) {
		this.liyeId = liyeId;
	}

	public Integer getLiye() {
		return liye;
	}

	public void setLiye(Integer liye) {
		this.liye = liye;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Transections getTransections() {
		return transections;
	}

	public void setTransections(Transections transections) {
		this.transections = transections;
	}

//	public byte[] getImage() {
//		return image;
//	}
//
//	public void setImage(byte[] image) {
//		this.image = image;
//	}

}
