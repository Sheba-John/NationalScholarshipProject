package com.nsp.project.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nsp.project.entity.Student;
import com.nsp.project.service.StudentServiceImpl;

@RestController
@RequestMapping("/Student")
public class StudentController {

	@Autowired
	private StudentServiceImpl stuService;

	@GetMapping("/list") // localhost:8080/Student/list/1
	public List<Student> getAllStudents() {
		return stuService.getAllStudents();

	}

	@GetMapping(value = "/get/{id}")
	public Optional<Student> getStudent(@PathVariable int id) {
		return stuService.getStudent(id);
	}
	
	 @PostMapping(value = "/add")
	 public void saveStudent(@RequestBody Student student) {
		 stuService.saveStudent(student);
	 }
	 
	 @PutMapping(value = "/update/{id}")
	 public void updateStudentDetails(@RequestBody Student student,@PathVariable int id ) {
		 stuService.updateStudentDetail(id, student);
	 }
	 
	 @DeleteMapping(value = "/delete/{id}")
	 public void deleteStudent(@PathVariable int id) {
		 stuService.deleteStudent(id);
		 	 
	 }
	 
}
