package com.nsp.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.nsp.project.entity.InstituteApplication;

@Service
public interface InstituteApplicationService {
	
	  public List<InstituteApplication> getInstituteDetails();
	  
	  public void saveInstitute (InstituteApplication instApp);
	  public Optional<InstituteApplication> getApplicationDetails(int id);
	  public void updateInstituteDetails(int id ,InstituteApplication instApp);
	  public void deleteInstitute(int id);
   

}
