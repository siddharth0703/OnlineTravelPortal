package com.hcl.aojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Enquiry")
public class Enquiry {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "E_Id")
	private int eid;
	
	@Column(name = "Description")
	private String description;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "E_Details")
	private Date eDetails;

	public Enquiry() {
		super();
	}

	public Enquiry(String description, Date eDetails) {
		super();
		this.description = description;
		this.eDetails = eDetails;
	}

	@Override
	public String toString() {
		return "Enquiry [eid=" + eid + ", description=" + description
				+ ", eDetails=" + eDetails + "]";
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date geteDetails() {
		return eDetails;
	}

	public void seteDetails(Date eDetails) {
		this.eDetails = eDetails;
	}
	
}
