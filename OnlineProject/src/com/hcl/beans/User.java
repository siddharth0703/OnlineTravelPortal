package com.hcl.beans;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

import com.hcl.aojo.ReservationAJO;

/*
 * DOOO NOT USE THIS AOJO;
 */

@Entity
@Table(name = "Customer")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Id")
	private int id;
	@Column(name = "Username")
	private String userName;
	@Column(name = "Password")
	private String password1;
	@Column(name = "Email")
	private String email;
	@Column(name = "Phone")
	private String phone;
	@Column(name = "City")
	private String city;


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User() {
		super();
	}

	public User(String userName, String password1, String email, String phone,
			String city, ReservationAJO res) {
		super();
		this.userName = userName;
		this.password1 = password1;
		this.email = email;
		this.phone = phone;
		this.city = city;
		
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
