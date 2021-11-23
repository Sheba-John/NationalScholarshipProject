package com.nsp.project.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="MINISTRY")
public class Ministry {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ministryId;

	private String stateName;
	
	private String password;
	
	private String officerName;
	
	private Long mobileNumber;
	
	private String email;
	

	public int getMinistryId() {
		return ministryId;
	}


	public void setMinistryId(int ministryId) {
		this.ministryId = ministryId;
	}


	public String getStateName() {
		return stateName;
	}


	public void setStateName(String stateName) {
		this.stateName = stateName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getOfficerName() {
		return officerName;
	}


	public void setOfficerName(String officerName) {
		this.officerName = officerName;
	}


	public Long getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	
	

}
