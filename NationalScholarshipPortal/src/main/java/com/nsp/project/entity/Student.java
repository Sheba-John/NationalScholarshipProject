package com.nsp.project.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENT_RECORD")
public class Student {
	
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int studentId;
	private int instituteCode;
	private String studentName;
	private LocalDate dateOfBirth;
	private String gender;
	private Long mobileNumber;
	private String email;
	
	private String state;
	private String district;
	
	private String adharNumber;
	private String bankAccountNumber;
	
	private String bankIfsc;
	private String bankName;
	
	private String password;
	
	

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "student")
	private List<StudentApplication> stuApp;
	
	
    @ManyToOne
    private InstituteApplication instApp;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getInstituteCode() {
		return instituteCode;
	}

	public void setInstituteCode(int instituteCode) {
		this.instituteCode = instituteCode;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getAdharNumber() {
		return adharNumber;
	}

	public void setAdharNumber(String adharNumber) {
		this.adharNumber = adharNumber;
	}

	public String getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setBankAccountNumber(String bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	public String getBankIfsc() {
		return bankIfsc;
	}

	public void setBankIfsc(String bankIfsc) {
		this.bankIfsc = bankIfsc;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<StudentApplication> getStuApp() {
		return stuApp;
	}

	public void setStuApp(List<StudentApplication> stuApp) {
		this.stuApp = stuApp;
	}

	public InstituteApplication getInstApp() {
		return instApp;
	}

	public void setInstApp(InstituteApplication instApp) {
		this.instApp = instApp;
	}

	

	
	
	
	
	

}
