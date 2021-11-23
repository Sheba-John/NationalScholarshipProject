package com.nsp.project;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.nsp.project.entity.Student;
import com.nsp.project.repository.StudentRepository;

@SpringBootTest
public class StudentTest {
 
	
	@Autowired
	StudentRepository stRepo;
	
	
	 @PersistenceUnit
	   EntityManagerFactory entityManagerFactory;

	 
	 
	@Test
	void insertDetails() {
	
		
		System.out.println("Entity Manager Factory : "+entityManagerFactory);
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		System.out.println("Entity Manager : "+entityManager);
		
		EntityTransaction transaction = entityManager.getTransaction();

		
		System.out.println("Entity Manager : "+entityManager);
		
		transaction.begin();
		
		
	
		LocalDate ld = LocalDate.of(2021,10,11);

		
	    Student s = new Student();
		s.setAdharNumber("462773832833");
		s.setBankAccountNumber("20380162843");
		s.setStudentName("Aamir Khan");
		s.setBankIfsc("SBIN0000481");
		s.setGender("Male");
		s.setDistrict("Shahdol");
		s.setEmail("aamir.007sdl.ak@gmail.com");
		s.setBankName("SBI");
		s.setDateOfBirth(ld);
		s.setInstituteCode(3);
		entityManager.persist(s);
		transaction.commit();
	}

}
