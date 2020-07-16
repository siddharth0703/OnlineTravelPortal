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
@Table(name = "HotelBook")
public class HotelAjo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "H_Id")
	private int id;
	
	@Column(name="H_Name")
	private String hName;
	
	@Column(name="H_Address")
	private String address;
	
	@Column(name="Amount")
	private int amount;
	
	@Column(name="Rooms")
	private int rooms;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "H_C_In")
	private Date hCheckIn;
	

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "H_C_Out")
	private Date hCheckOut;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String gethName() {
		return hName;
	}


	public void sethName(String hName) {
		this.hName = hName;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getAmount() {
		return amount;
	}


	public void setAmount(int amount) {
		this.amount = amount;
	}


	public int getRooms() {
		return rooms;
	}


	public void setRooms(int rooms) {
		this.rooms = rooms;
	}


	public Date gethCheckIn() {
		return hCheckIn;
	}


	public void sethCheckIn(Date hCheckIn) {
		this.hCheckIn = hCheckIn;
	}


	public Date gethCheckOut() {
		return hCheckOut;
	}


	public void sethCheckOut(Date hCheckOut) {
		this.hCheckOut = hCheckOut;
	}


	@Override
	public String toString() {
		return "HotelAjo [id=" + id + ", hName=" + hName + ", address="
				+ address + ", amount=" + amount + ", rooms=" + rooms
				+ ", hCheckIn=" + hCheckIn + ", hCheckOut=" + hCheckOut + "]";
	}


	public HotelAjo(String hName, String address, int amount, int rooms,
			Date hCheckIn, Date hCheckOut) {
		super();
		this.hName = hName;
		this.address = address;
		this.amount = amount;
		this.rooms = rooms;
		this.hCheckIn = hCheckIn;
		this.hCheckOut = hCheckOut;
	}


	public HotelAjo() {
		super();
	}
	
}
