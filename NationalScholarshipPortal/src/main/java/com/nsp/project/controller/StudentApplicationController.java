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
import org.springframework.web.bind.annotation.RestController;

import com.nsp.project.entity.StateNodalOfficer;
import com.nsp.project.entity.StudentApplication;
import com.nsp.project.service.StudentApplicationServiceImpl;

@RestController
@RequestMapping("/StudentApplication")
public class StudentApplicationController {
	
	@Autowired
	StudentApplicationServiceImpl service;
	
	@GetMapping("/list")
	public List<StudentApplication> getAllStudents(){
		return service.getAllApplication();
	}


	@GetMapping("/get/{id}")
	public Optional<StudentApplication> getApplication(@PathVariable int id){
		return service.getApplication(id);
	}
	
	@PostMapping("/save")
	 public void saveApplication(@RequestBody StudentApplication application) {
		 service.saveApplication(application);
	 }
	
	@PutMapping("/update/{id}")
	public void updateApplication(@PathVariable int id, @RequestBody StudentApplication application) {
		
		service.updateApplication(id, application);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteApplication(@PathVariable int id) {
		
		service.deleteApplication(id);
	}
	
}
