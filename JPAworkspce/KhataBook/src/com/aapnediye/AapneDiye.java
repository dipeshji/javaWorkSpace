package com.aapnediye;

import java.sql.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.transections.Transections;

@Entity
@Table(name = "aapnediye")
public class AapneDiye {

	@Id
	@Column(name = "diye_id")
	private Integer diyeId;

	@Column(name = "diye")
	private Integer aapneDiye;

	@Column(name = "details")
	private String details;

//	@Column(name = "image")
//	private byte[] image;

	@Column(name = "date")
	private Date date;

	@ManyToOne(targetEntity = Transections.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "tx_id", referencedColumnName = "tx_id")
	private Transections transections;

	public Integer getDiyeId() {
		return diyeId;
	}

	public void setDiyeId(Integer diyeId) {
		this.diyeId = diyeId;
	}

	public Integer getAapneDiye() {
		return aapneDiye;
	}

	public void setAapneDiye(Integer aapneDiye) {
		this.aapneDiye = aapneDiye;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

//	public byte[] getImage() {
//		return image;
//	}
//
//	public void setImage(byte[] image) {
//		this.image = image;
//	}

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

}
