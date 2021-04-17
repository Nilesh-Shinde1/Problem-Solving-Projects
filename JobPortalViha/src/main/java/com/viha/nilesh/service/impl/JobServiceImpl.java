package com.viha.nilesh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viha.nilesh.model.Job;
import com.viha.nilesh.repo.IJobRepo;
import com.viha.nilesh.service.IJobService;

@Service
public class JobServiceImpl implements IJobService {
	
	@Autowired
	private IJobRepo jobRepo;

	@Override
	public String postJob(Job job) {
		return jobRepo.save(job).getTitle();
	}

	@Override
	public List<Job> getAllJobs() {
		return jobRepo.findAll();
	}
	
	@Override
	public List<Job> getJobsByLocation(String jobLocation) {
		return jobRepo.findByJobLocation(jobLocation);
	}

}
