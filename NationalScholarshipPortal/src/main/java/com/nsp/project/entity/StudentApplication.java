package com.nsp.project.entity;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name ="STUDENT_APPLICATION")
public class StudentApplication {
	
	
	
	@Id
//	@GeneratedValue(strategy =GenerationType.IDENTITY)

	private int studentId;
	
	private int schemeId;
	
	private String religion;
	
	private String Community;
	
	private String fathersName;
	
	private String mothersName;
	
	private Long income;
	
	private String course;
	
	private String intermediatePercentage;
	
	private String postIntermediatePercentage;
	
	private boolean disability;
	
	private LocalDate appliedDate;
	
	private String status;
	
	private LocalDate instituteAcceptedDate;
	
	private LocalDate stateAcceptedDate;
	
	private LocalDate ministryAcceptedDate;
	
	@ManyToMany(fetch = FetchType.EAGER , cascade =CascadeType.ALL)
	@JoinTable(name ="STUDENT",	joinColumns={@JoinColumn(name="SCHEME_ID")},
			inverseJoinColumns={@JoinColumn(name="STUDENT_ID")})
	private Set<Scheme> scheme = new HashSet<>();
	
	
	@ManyToOne
	private Student student;
	

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getSchemeId() {
		return schemeId;
	}

	public void setSchemeId(int schemeId) {
		this.schemeId = schemeId;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getCommunity() {
		return Community;
	}

	public void setCommunity(String community) {
		Community = community;
	}

	public String getFathersName() {
		return fathersName;
	}

	public void setFathersName(String fathersName) {
		this.fathersName = fathersName;
	}

	public String getMothersName() {
		return mothersName;
	}

	public void setMothersName(String mothersName) {
		this.mothersName = mothersName;
	}

	public Long getIncome() {
		return income;
	}

	public void setIncome(Long income) {
		this.income = income;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getIntermediatePercentage() {
		return intermediatePercentage;
	}

	public void setIntermediatePercentage(String intermediatePercentage) {
		this.intermediatePercentage = intermediatePercentage;
	}

	public String getPostIntermediatePercentage() {
		return postIntermediatePercentage;
	}

	public void setPostIntermediatePercentage(String postIntermediatePercentage) {
		this.postIntermediatePercentage = postIntermediatePercentage;
	}

	public boolean isDisability() {
		return disability;
	}

	public void setDisability(boolean disability) {
		this.disability = disability;
	}

	public LocalDate getAppliedDate() {
		return appliedDate;
	}

	public void setAppliedDate(LocalDate appliedDate) {
		this.appliedDate = appliedDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDate getInstituteAcceptedDate() {
		return instituteAcceptedDate;
	}

	public void setInstituteAcceptedDate(LocalDate instituteAcceptedDate) {
		this.instituteAcceptedDate = instituteAcceptedDate;
	}

	public LocalDate getStateAcceptedDate() {
		return stateAcceptedDate;
	}

	public void setStateAcceptedDate(LocalDate stateAcceptedDate) {
		this.stateAcceptedDate = stateAcceptedDate;
	}

	public LocalDate getMinistryAcceptedDate() {
		return ministryAcceptedDate;
	}

	public void setMinistryAcceptedDate(LocalDate ministryAcceptedDate) {
		this.ministryAcceptedDate = ministryAcceptedDate;
	}

	public Set<Scheme> getScheme() {
		return scheme;
	}

	public Student getStudent() {
		return student;
	}

	public void setScheme(Set<Scheme> scheme) {
		this.scheme = scheme;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	
	
	

}
