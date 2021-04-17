package com.viha.nilesh.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.viha.nilesh.model.Job;

@Repository
public interface IJobRepo extends JpaRepository<Job, Integer> {
	List<Job> findByJobLocation(String jobLocation);
}
