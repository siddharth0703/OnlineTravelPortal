package com.hcl.aojo;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
@Table(name="ReservationCheck")
public class ReservationAJO {
	@Override
	public String toString() {
		return "ReservationAJO [rid=" + rid + ", d1=" + d1 + "]";
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "R_Id", nullable = false)
	private int rid;
	
	public ReservationAJO() {
		super();
	}

	@Temporal(TemporalType.DATE)
	@Column(name="R_Date")
	private Date d1;
	

	public ReservationAJO( Date date1) {
		super();
	d1=date1;
	}

	public int getRid() {
		return rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}
	public Date getD1() {
		return d1;
	}

	public void setD1(Date d1) {
		this.d1 = d1;
	}






}
