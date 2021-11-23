package com.nsp.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nsp.project.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>{

 	
	
}
