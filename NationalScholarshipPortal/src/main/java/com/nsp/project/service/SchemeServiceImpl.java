package com.nsp.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nsp.project.repository.SchemeRepository;


@Service
public class SchemeServiceImpl implements SchemeService {
	
	@Autowired
	SchemeRepository repo;

	@Override
	public List<com.nsp.project.entity.Scheme> getAllSchemes() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Optional<com.nsp.project.entity.Scheme> getScheme(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

	@Override
	public void saveScheme(com.nsp.project.entity.Scheme s) {
		// TODO Auto-generated method stub
		repo.save(s);
	}

	@Override
	public void updateSchemeDetail(int id, com.nsp.project.entity.Scheme s) {
		// TODO Auto-generated method stub
		s.setSchemeId(id);
		repo.save(s);
	}

	@Override
	public void deleteScheme(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}
	
}
