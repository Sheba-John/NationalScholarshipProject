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

import com.nsp.project.entity.InstituteApplication;
import com.nsp.project.entity.Student;
import com.nsp.project.entity.StudentApplication;
import com.nsp.project.service.InstituteApplicationServiceimpl;
import com.nsp.project.service.StudentServiceImpl;

@RestController
@RequestMapping("/Institute")
public class InstituteApplicationController {

	
	@Autowired
	private InstituteApplicationServiceimpl service;

	@GetMapping("/list") // localhost:8080/Student/list/1
	public List<InstituteApplication> getAllApplications() {
		return service.getInstituteDetails();

	}

	@GetMapping(value = "/get/{id}")
	public Optional<InstituteApplication> getApplicationById(@PathVariable int id) {
		return service.getApplicationDetails(id);
	}
	
	 @PostMapping(value = "/add")
	 public void saveInstitute(@RequestBody InstituteApplication instApp) {
		 service.saveInstitute(instApp);
	 }
	 
	 @PutMapping(value = "/update/{id}")
	 public void updateInstituteDetails(@RequestBody InstituteApplication instApp,@PathVariable int id ) {
		 service.updateInstituteDetails(id, instApp);
	 }
	 
	 @DeleteMapping(value = "/delete/{id}")
	 public void deleteInstitute(@PathVariable int id) {
       service.deleteInstitute(id);		 	 
	 }
	 
}
