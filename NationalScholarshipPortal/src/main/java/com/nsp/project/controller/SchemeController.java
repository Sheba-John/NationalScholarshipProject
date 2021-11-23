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
import com.nsp.project.service.SchemeServiceImpl;


@RestController
@RequestMapping("/scheme")
public class SchemeController {
	
	@Autowired
	private SchemeServiceImpl service;
	
	
	@GetMapping("/list")
	public List<Scheme> getSchemes(){
		
		return service.getAllSchemes();
	}

	
	@GetMapping(value ="/get/{id}")
	public Optional<Scheme> getScheme(@PathVariable int id){
		return service.getScheme(id);
	}
	
	@PostMapping(value = "/save")
	 public void saveScheme(@RequestBody Scheme scheme) {
		 service.saveScheme(scheme);
	 }
	
	@PutMapping(value ="/update/{id}")
	public void updateScheme(@PathVariable int id,@RequestBody Scheme scheme) {
		
		service.updateSchemeDetail(id, scheme);
	}
	
	@DeleteMapping(value ="/delete/{id}")
	public void deleteScheme(@PathVariable int id) {
		
		service.deleteScheme(id);
	}
}
