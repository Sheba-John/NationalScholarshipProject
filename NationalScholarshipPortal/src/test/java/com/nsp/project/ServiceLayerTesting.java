package com.nsp.project;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.nsp.project.entity.InstituteApplication;
import com.nsp.project.entity.Ministry;
import com.nsp.project.entity.Scheme;
import com.nsp.project.entity.StateNodalOfficer;
import com.nsp.project.entity.Student;
import com.nsp.project.entity.StudentApplication;
import com.nsp.project.repository.StudentRepository;
import com.nsp.project.service.InstituteApplicationServiceimpl;
import com.nsp.project.service.MinistryServiceImpl;
import com.nsp.project.service.SchemeServiceImpl;
import com.nsp.project.service.StateNodalOfficerServiceImpl;
import com.nsp.project.service.StudentApplicationServiceImpl;
import com.nsp.project.service.StudentServiceImpl;

@SpringBootTest
public class ServiceLayerTesting {

	@Autowired
	StudentServiceImpl stuService;

	@Autowired
	InstituteApplicationServiceimpl instService;

	@Autowired
	StudentApplicationServiceImpl appService;

	@Autowired
	MinistryServiceImpl minService;
	
	@Autowired
	SchemeServiceImpl schemeservice;
	
	@Autowired
	StateNodalOfficerServiceImpl stateservice;

//	@Test
//	void deleteStudent() {
//		
//	stuService.deleteStudent(3);
//	}

	@Test
	void updateStudent() {
		Student student = new Student();
		student.setStudentName("Vannu");
		student.setDateOfBirth(null);
		student.setGender("Female");
		student.setMobileNumber(9763445184l);
		student.setEmail("vanu@gmail.com");
		student.setState("pune");
		student.setDistrict("maha");
		student.setAdharNumber("412563254125");
		student.setBankAccountNumber("12365987456325");
		student.setBankIfsc("HDFC0052");
		student.setBankName("HDFC");
		student.setPassword("vanu510");

		stuService.updateStudentDetail(5, student);
	}

	void getStudent() {

		Optional<Student> st = stuService.getStudent(3);

	}

	@Test
	void save() {
		Student student = new Student();
		student.setInstituteCode(1);
		student.setStudentName("Vannu");
		student.setDateOfBirth(null);
		student.setGender("Female");
		student.setMobileNumber(9763445184l);
		student.setEmail("vanu@gmail.com");
		student.setState("pune");
		student.setDistrict("maha");
		student.setAdharNumber("412563254125");
		student.setBankAccountNumber("12365987456325");
		student.setBankIfsc("HDFC0052");
		student.setBankName("HDFC");
		student.setPassword("vanu510");

		InstituteApplication application = new InstituteApplication();
		application.setInstitudeCode(1);
		application.setInstituteName("Christ");
		application.setDistrict("Pune");
		application.setCity("Pune");
		application.setPinCode("412307");
		application.setDiseCode(23);
		application.setPassword("vanz");
		application.setPrincipal("sony");
		application.setTelephone(022256354l);
		application.setApplyDate(null);
		application.setStatus("approved");
		application.setStateAcceptedDate(null);
		application.setMinistryAcceptedDate(null);

		StudentApplication studApp = new StudentApplication();
		studApp.setStudentId(1);
		studApp.setSchemeId(2);
		studApp.setReligion("Hindu");
		studApp.setCommunity("abc");
		studApp.setFathersName("Venkat");
		studApp.setMothersName("Jaya");
		studApp.setIncome(253000l);
		studApp.setCourse("Science");
		studApp.setIntermediatePercentage("87%");
		studApp.setPostIntermediatePercentage("78%");
		studApp.setDisability(false);
		studApp.setAppliedDate(null);
		studApp.setStatus("pending");
		studApp.setInstituteAcceptedDate(null);
		studApp.setStateAcceptedDate(null);
		studApp.setMinistryAcceptedDate(null);

		stuService.saveStudent(student);
		instService.saveInstitute(application);
		appService.saveApplication(studApp);
	}

	@Test
	void saveMinitry() {
		Ministry min = new Ministry();
		min.setStateName("Maha");
		min.setPassword("mh12");
		min.setOfficerName("nsp");
		min.setMobileNumber(956325412l);
		min.setEmail("ministry@gmail.com");
		
		minService.saveMinistry(min);
	}
	@Test
	public void saveScheme() {
	Scheme sch = new Scheme();

	sch.setSchemeName("Fergusson");
	sch.setLastDateToApply(null);
	sch.setAmount(500);

	schemeservice.saveScheme(sch);

	}
	@Test
	public void saveStateNodalOfficer() {
	StateNodalOfficer state = new StateNodalOfficer();
	state.setStateNodalOfficerId(1);
	state.setStateName("Maharashtra");
	state.setPassword("sheba1234");
	state.setOfficerName("Sheba John");
	state.setMobileNumber(9762669665l);
	state.setEmail("johnsheba97@gmail.com");
	
	
	stateservice.saveNodalOfficer(state);


	}


}