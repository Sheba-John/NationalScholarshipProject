package com.nsp.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.nsp.project.entity.StateNodalOfficer;

@Service
public interface StateNodalOfficerService {
	 public List<StateNodalOfficer> getNodalOfficers();
	  public Optional<StateNodalOfficer> getNodalOfficerId(int id);
	  public void saveNodalOfficer (StateNodalOfficer s);
	  public void updateNodalOfficer(int id,StateNodalOfficer nodalOfficer);
	  public void deleteNodalOfficer(int id);
}
