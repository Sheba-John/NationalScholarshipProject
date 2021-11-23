package com.nsp.project;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.nsp.project.entity.Student;
import com.nsp.project.repository.StudentRepository;
import com.nsp.project.service.StudentServiceImpl;

@SpringBootTest
public class NationalScholarshipPortalApplicationTests {


    
    
    @Autowired
	StudentRepository repo;
    
    @Autowired
    StudentServiceImpl service;

	@Test
	void contextLoads() {

	}

	@Test
	public void insertDetails() {
        
		Student s = new Student();
		LocalDate ld = LocalDate.of(1997, 05, 25);

		s.setAdharNumber("4563251456");
		s.setBankAccountNumber("51024631589");
		s.setStudentName("Vanashree");
		s.setBankIfsc("HDFC0052");
		s.setGender("Female");
		s.setDistrict("Pune");
		s.setEmail("vanu@gmail.com");
		s.setBankName("HDFC");
		s.setDateOfBirth(ld);
		s.setInstituteCode(2);

        repo.save(s);
	}
	
	@Test
	public void getStudents() {
      service.getAllStudents();
      
      List<Student> list = service.getAllStudents();
      for(Student stu: list)
		{
			System.out.println(stu.getStudentId());
			System.out.println(stu.getStudentName());
			System.out.println(stu.getBankIfsc());
			System.out.println(stu.getStudentId());
			System.out.println(stu.getStudentId());
			System.out.println(stu.getStudentId());
			System.out.println(stu.getStudentId());
			System.out.println(stu.getStudentId());

			
		}
	     
	}
}
