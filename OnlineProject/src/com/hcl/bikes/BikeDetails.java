package com.hcl.bikes;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bike")
public class BikeDetails implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	String bikeid;
	String bikeName;
	String type;
	int fare;
	public String getBikeid() {
		return bikeid;
	}
	public void setBikeid(String bikeid) {
		this.bikeid = bikeid;
	}
	public String getBikeName() {
		return bikeName;
	}
	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getFare() {
		return fare;
	}
	public void setFare(int fare) {
		this.fare = fare;
	}

}