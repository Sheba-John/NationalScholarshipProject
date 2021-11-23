package com.nsp.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.nsp.project.entity.StudentApplication;

@Service
public interface StudentApplicationService {
	 public List<StudentApplication> getAllApplication();
	  public Optional<StudentApplication> getApplication(int id);
	  public void saveApplication (StudentApplication s);
	  public void updateApplication(int id,StudentApplication s);
	  public void deleteApplication(int id);
}
