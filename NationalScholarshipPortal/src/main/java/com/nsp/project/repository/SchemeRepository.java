package com.nsp.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nsp.project.entity.Scheme;


@Repository
public interface SchemeRepository extends JpaRepository<Scheme, Integer> {

}
