package com.hcl.usercrediantials;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity  
@Table(name="Customer")
public class DetailsOfUser {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Id")
	private int id;
	@Column(name="Username")
	    private String userName;
	@Column(name="Password")
	    private String password1;
	@Column(name="Email")
	    private String email;
	@Column(name="Phone",length=10)
	    private long phone;
	@Column(name="Address")
    private String address;
	@Column(name="City")
	    private String city;
	@Column(name="ZipCode")
    private int zipcode;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword1() {
		return password1;
	}
	public void setPassword1(String password1) {
		this.password1 = password1;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	
}
