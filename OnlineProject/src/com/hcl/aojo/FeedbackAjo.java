package com.hcl.aojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Feedback")
public class FeedbackAjo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "F_Id")
	private int fid;
	
	@Column(name = "Description")
	private String description;

	@Override
	public String toString() {
		return "FeedbackAjo [fid=" + fid + ", description=" + description + "]";
	}

	public FeedbackAjo() {
		super();
	}

	public FeedbackAjo(String description) {
		super();
		this.description = description;
	}

	public int getFid() {
		return fid;
	}

	public void setFid(int fid) {
		this.fid = fid;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
