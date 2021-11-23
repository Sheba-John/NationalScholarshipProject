package com.nsp.project;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.nsp.project.entity.InstituteApplication;
import com.nsp.project.entity.Student;
import com.nsp.project.repository.InstituteApplicationRepository;
import com.nsp.project.repository.StudentRepository;

@SpringBootTest
public class RepositoriesTesting {
	
	@Autowired
	StudentRepository studentRepository;
	
	
	@Autowired
	InstituteApplicationRepository instituteRepository;
	
	
	
	@Test
	void saveStudent() {
		
		Student s = new Student();
		LocalDate ld = LocalDate.of(2021, 10, 11);

		s.setAdharNumber("462773832833");
		s.setBankAccountNumber("20380162843");
		s.setStudentName("Aamir");
		s.setBankIfsc("SBIN0000481");
		s.setGender("Male");
		s.setDistrict("Shahdol");
		s.setEmail("avinash@gmail.com");
		s.setBankName("SBI");
		s.setDateOfBirth(ld);
		s.setInstituteCode(2);
		
		InstituteApplication in = new InstituteApplication();
		in.setInstitudeCode(2);
		in.setApplyDate(ld);
		in.setCity("pune");
		
		instituteRepository.save(in);
		

        studentRepository.save(s);
	}
	
	
	@Test
	void saveInstitute() {
		
		InstituteApplication instApp = new InstituteApplication();
		
		LocalDate ld = LocalDate.of(2021, 10, 11);

		instApp.setInstitudeCode(32);
		instApp.setApplyDate(ld);
		
		instituteRepository.save(instApp);
	}

	@Test
	void listStudents() {
		List<Student> list = studentRepository.findAll();
	    for(Student stu: list)
			{
				System.out.println(stu.getStudentId());
				System.out.println(stu.getStudentName());
				System.out.println(stu.getBankIfsc());
				System.out.println(stu.getBankName());
				System.out.println(stu.getAdharNumber());
				System.out.println(stu.getEmail());
				System.out.println(stu.getState());
				System.out.println(stu.getGender());

				
			}
		

	}
	
	
	@Test
	void deleteStudent() {
		
		Student s = studentRepository.findById(2).get();
		studentRepository.delete(s);
		
		
		
	}

}
