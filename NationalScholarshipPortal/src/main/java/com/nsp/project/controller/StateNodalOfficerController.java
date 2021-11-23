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

import com.nsp.project.entity.Scheme;
import com.nsp.project.entity.StateNodalOfficer;
import com.nsp.project.service.StateNodalOfficerServiceImpl;

@RestController
@RequestMapping("/NodalOfficer")
public class StateNodalOfficerController {
	
	@Autowired
	StateNodalOfficerServiceImpl service;
	
	@GetMapping("/list")
	public List<StateNodalOfficer> getNodalOfficerList(){
		
		return service.getNodalOfficers();
	}
	
	@GetMapping("/get/{id}")
	public Optional<StateNodalOfficer> getNodalOfficer(@PathVariable int id){
		return service.getNodalOfficerId(id);
	}
	
	@PostMapping("/save")
	 public void saveOfficer(@RequestBody StateNodalOfficer officer) {
		 service.saveNodalOfficer(officer);
	 }
	
	@PutMapping("/update/{id}")
	public void updateOfficer(@PathVariable int id,@RequestBody  StateNodalOfficer officer) {
		
		service.updateNodalOfficer(id, officer);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteOfficer(@PathVariable int id) {
		
		service.deleteNodalOfficer(id);
	}
}
