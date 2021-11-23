package com.nsp.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.nsp.project.entity.Ministry;



@Service
public interface MinistryService {

	  public List<Ministry> getAllMinistryDetails();
	  
	  public void saveMinistry (Ministry min);
	  public Optional <Ministry> getMinistryDetails(int id);
	  public void updateMinistryDetails(int id ,Ministry ministry);
	  public void deleteMinistry(int id);
    
    
}
