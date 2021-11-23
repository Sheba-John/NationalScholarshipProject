package com.nsp.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nsp.project.entity.StudentApplication;


@Repository
public interface StudentApplicationRepo extends JpaRepository<StudentApplication, Integer> {

}
