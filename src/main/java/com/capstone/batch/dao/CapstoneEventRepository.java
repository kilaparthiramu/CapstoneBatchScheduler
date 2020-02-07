package com.capstone.batch.dao;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.capstone.batch.model.CapstoneEvent;


@Repository
public interface CapstoneEventRepository extends ReactiveCrudRepository<CapstoneEvent, String>{

}
