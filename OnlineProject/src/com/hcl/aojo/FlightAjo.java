package com.hcl.aojo;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Flight")
public class FlightAjo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Flight_Id")
	private int id;

	@Override
	public String toString() {
		return "FlightAjo [id=" + id + ", fName=" + fName + ", fDetails="
				+ fDetails + ", seats=" + seats + ", arrCity=" + arrCity
				+ ", deptCity=" + deptCity + "]\n";
	}

	public FlightAjo(String fName, Date fDetails, int seats, String arrCity,
			String deptCity) {
		super();
		this.fName = fName;
		this.fDetails = fDetails;
		this.seats = seats;
		this.arrCity = arrCity;
		this.deptCity = deptCity;
	}

	public FlightAjo() {
		super();
	}

	public Date getfDetails() {
		return fDetails;
	}

	public void setfDetails(Date fDetails) {
		this.fDetails = fDetails;
	}

	@Column(name = "Flight_Name")
	private String fName;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "F_Details")
	private Date fDetails;

	@Column(name = "F_Seats")
	private int seats;
	@Column(name = "F_ArrCity")
	private String arrCity;

	@Column(name = "F_DeptCity")
	private String deptCity;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
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

}
