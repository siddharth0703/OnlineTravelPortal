package com.hcl.aojo;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity  
@Table(name="Customer") 
public class LoginAojo {
	public LoginAojo(String userName, String password1, String email, String phone,String address, String city,int zipcode) {
		super();
		this.userName = userName;
		this.password1 = password1;
		this.email = email;
		this.phone = phone;
		this.city = city;
		this.zipcode=zipcode;
		this.address=address;
	}

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
	    private String phone;
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
	 
	    public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public int getZipcode() {
			return zipcode;
		}

		public void setZipcode(int zipcode) {
			this.zipcode = zipcode;
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

		public LoginAojo() {
			super();
		}
	    
	    
}
