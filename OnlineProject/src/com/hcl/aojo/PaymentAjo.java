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
@Table(name = "Payment")
public class PaymentAjo {
	public PaymentAjo(long amount, Date pDetails, String pType) {
		super();
		this.amount = amount;
		this.pDetails = pDetails;
		this.pType = pType;
	}

	@Override
	public String toString() {
		return "PaymentAjo [id=" + id + ", amount=" + amount + ", pDetails="
				+ pDetails + ", pType=" + pType + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public PaymentAjo() {
		super();
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public Date getpDetails() {
		return pDetails;
	}

	public void setpDetails(Date pDetails) {
		this.pDetails = pDetails;
	}

	public String getpType() {
		return pType;
	}

	public void setpType(String pType) {
		this.pType = pType;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "P_Id")
	private int id;

	@Column(name = "Amount")
	private long amount;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "P_Details")
	private Date pDetails;

	@Column(name = "P_Type")
	private String pType;

}
