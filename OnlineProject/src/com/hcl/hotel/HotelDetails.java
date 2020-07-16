package com.hcl.hotel;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hotel")
public class HotelDetails implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	int hotelid;
	String hotelName;
	String hotelCity;
	String address;
	String contactNumber;
	int fare;
	

	public int getHotelid() {
		return hotelid;
	}
	public void setHotelid(int hotelid) {
		this.hotelid = hotelid;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getHotelCity() {
		return hotelCity;
	}
	public void setHotelCity(String hotelCity) {
		this.hotelCity = hotelCity;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public int getFare() {
		return fare;
	}
	public void setFare(int fare) {
		this.fare = fare;
	}
	
}
