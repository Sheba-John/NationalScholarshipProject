package com.nsp.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nsp.project.entity.StudentApplication;
import com.nsp.project.repository.StudentApplicationRepo;

@Service
public class StudentApplicationServiceImpl implements StudentApplicationService {

	@Autowired
	StudentApplicationRepo repo;

	@Override
	public List<StudentApplication> getAllApplication() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Optional<StudentApplication> getApplication(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

	@Override
	public void saveApplication(StudentApplication s) {
		// TODO Auto-generated method stub
		repo.save(s);
	}

	@Override
	public void updateApplication(int id, StudentApplication s) {
		// TODO Auto-generated method stub
		s.setStudentId(id);
		repo.save(s);
	}

	@Override
	public void deleteApplication(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

}
