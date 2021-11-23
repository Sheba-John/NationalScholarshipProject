package com.nsp.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nsp.project.entity.InstituteApplication;

@Repository
public interface InstituteApplicationRepository extends JpaRepository<InstituteApplication, Integer> {

}
