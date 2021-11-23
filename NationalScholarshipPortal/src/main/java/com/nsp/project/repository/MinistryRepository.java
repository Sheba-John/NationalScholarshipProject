package com.nsp.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nsp.project.entity.Ministry;

@Repository
public interface MinistryRepository extends JpaRepository<Ministry, Integer> {


}
