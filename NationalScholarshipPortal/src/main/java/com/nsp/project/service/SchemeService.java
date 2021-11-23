package com.nsp.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.nsp.project.entity.Scheme;

@Service
public interface SchemeService {
	 public List<Scheme> getAllSchemes();
	  public Optional<Scheme> getScheme(int id);
	  public void saveScheme (Scheme s);
	  public void updateSchemeDetail(int id,Scheme s);
	  public void deleteScheme(int id);
}
