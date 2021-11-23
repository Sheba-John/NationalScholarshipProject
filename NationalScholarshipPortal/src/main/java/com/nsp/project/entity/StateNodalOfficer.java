package com.nsp.project.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "STATE_NODAL_OFFICER")
public class StateNodalOfficer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int stateNodalOfficerId;
	
	private String stateName;
	
	
	private String password;
	
	
	private String officerName;
	
	
	private Long mobileNumber;
	
	
    private String email;
    
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sno")
    private  List<InstituteApplication> instApplication;

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

	public int getStateNodalOfficerId() {
		return stateNodalOfficerId;
	}

	public void setStateNodalOfficerId(int stateNodalOfficerId) {
		this.stateNodalOfficerId = stateNodalOfficerId;
	}

	public List<InstituteApplication> getInstApplication() {
		return instApplication;
	}

	public void setInstApplication(List<InstituteApplication> instApplication) {
		this.instApplication = instApplication;
	}



	
	
     
}
