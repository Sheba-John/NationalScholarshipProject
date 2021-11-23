package com.nsp.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nsp.project.entity.Ministry;
import com.nsp.project.entity.Student;
import com.nsp.project.repository.StudentRepository;


@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository repo;

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	

	@Override
	public void saveStudent(Student s) {
		// TODO Auto-generated method stub
		repo.save(s);
	}



	public Optional<Student> getStudent(int id) {
		
		 
	     return repo.findById(id);
	}


	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);;
	}



	@Override
	public void updateStudentDetail(int id, Student student) {
		// TODO Auto-generated method stub
	    student.setStudentId(id);
	    repo.save(student);
	}

}
