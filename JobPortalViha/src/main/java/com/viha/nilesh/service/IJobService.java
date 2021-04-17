package com.viha.nilesh.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.viha.nilesh.model.Job;

@Service
public interface IJobService {
	String postJob(Job job);
	List<Job> getAllJobs();
	List<Job> getJobsByLocation(String jobLocation);
}
