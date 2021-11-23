package com.nsp.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nsp.project.entity.InstituteApplication;
import com.nsp.project.repository.InstituteApplicationRepository;

@Service
public class InstituteApplicationServiceimpl implements InstituteApplicationService {
	
	@Autowired
	InstituteApplicationRepository repo;

	@Override
	public List<InstituteApplication> getInstituteDetails() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void saveInstitute(InstituteApplication instApp) {
		// TODO Auto-generated method stub
		repo.save(instApp);
	}

	@Override
	public Optional<InstituteApplication> getApplicationDetails(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateInstituteDetails(int id, InstituteApplication instApp) {
		// TODO Auto-generated method stub
		instApp.setInstitudeCode(id);
		repo.save(instApp);
	}

	@Override
	public void deleteInstitute(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

}
