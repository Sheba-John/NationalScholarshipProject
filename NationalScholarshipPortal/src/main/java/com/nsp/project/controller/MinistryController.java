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

import com.nsp.project.entity.Ministry;
import com.nsp.project.service.MinistryServiceImpl;

@RestController
@RequestMapping("/Ministry")
public class MinistryController {
	
	@Autowired
	private MinistryServiceImpl service;
	
	
	@GetMapping("/list")
	public List<Ministry> getAllMinistries(){
		return service.getAllMinistryDetails();
	}
	
	
	@GetMapping( value ="/get/{id}")
	public Optional<Ministry> getMinistryDetails(@PathVariable int id){
		
		return service.getMinistryDetails(id);
	}
     
	@PostMapping(value ="/save")
	public void saveMinistry(@RequestBody Ministry ministry) {
		service.saveMinistry(ministry);
	}
	
	@PutMapping(value = "/update/{id}")
	public void updateMinistryDetails(@PathVariable int id,@RequestBody Ministry ministry) {
		
		service.updateMinistryDetails(id, ministry);
	}
	
	
	 @DeleteMapping(value = "/delete/{id}")
	 public void deleteMinistry(@PathVariable int id) {
       service.deleteMinistry(id);		 	 
	 }
}
