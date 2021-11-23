package com.nsp.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nsp.project.entity.StateNodalOfficer;
import com.nsp.project.repository.StateNodalOfficerRepository;


@Service
public class StateNodalOfficerServiceImpl implements StateNodalOfficerService {
	
	@Autowired
	StateNodalOfficerRepository repo;

	@Override
	public List<StateNodalOfficer> getNodalOfficers() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Optional<StateNodalOfficer> getNodalOfficerId(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

	@Override
	public void saveNodalOfficer(StateNodalOfficer s) {
		// TODO Auto-generated method stub
		repo.save(s);
	}

	@Override
	public void updateNodalOfficer(int id, StateNodalOfficer nodalOfficer) {
		// TODO Auto-generated method stub
		nodalOfficer.setStateNodalOfficerId(id);
		repo.save(nodalOfficer);
	}

	@Override
	public void deleteNodalOfficer(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

}
