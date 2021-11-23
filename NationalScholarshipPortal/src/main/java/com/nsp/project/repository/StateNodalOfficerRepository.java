package com.nsp.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nsp.project.entity.StateNodalOfficer;

@Repository
public interface StateNodalOfficerRepository extends JpaRepository<StateNodalOfficer, Integer>{

}
