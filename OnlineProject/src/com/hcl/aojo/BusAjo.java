package com.hcl.aojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import java.util.Date;

@Entity
@Table(name="Bus")
public class BusAjo {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="B_Id")
	private int id;

	@Column(name="B_Name")
	private String bName;
	
	@Column(name="B_ArrCity")
	private String arrCity;
	
	@Column(name="B_DeptCity")
	private String deptCity;
	
	@Column(name="B_Seats")
	private int seats;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "B_Details")
	private Date bDetails;

	public BusAjo() {
		super();
	}

	public BusAjo(String bName, String arrCity, String deptCity, int seats,
			Date bDetails) {
		super();
		this.bName = bName;
		this.arrCity = arrCity;
		this.deptCity = deptCity;
		this.seats = seats;
		this.bDetails = bDetails;
	}

	@Override
	public String toString() {
		return "BusAjo [id=" + id + ", bName=" + bName + ", arrCity=" + arrCity
				+ ", deptCity=" + deptCity + ", seats=" + seats + ", bDetails="
				+ bDetails + "]\n";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public String getArrCity() {
		return arrCity;
	}

	public void setArrCity(String arrCity) {
		this.arrCity = arrCity;
	}

	public String getDeptCity() {
		return deptCity;
	}

	public void setDeptCity(String deptCity) {
		this.deptCity = deptCity;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public Date getbDetails() {
		return bDetails;
	}

	public void setbDetails(Date bDetails) {
		this.bDetails = bDetails;
	}
	
	
	
}
