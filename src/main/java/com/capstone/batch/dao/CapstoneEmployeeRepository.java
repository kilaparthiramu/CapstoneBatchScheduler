package com.capstone.batch.dao;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.capstone.batch.model.CapstoneEmployee;


@Repository
public interface CapstoneEmployeeRepository extends ReactiveCrudRepository<CapstoneEmployee, String>{

}
