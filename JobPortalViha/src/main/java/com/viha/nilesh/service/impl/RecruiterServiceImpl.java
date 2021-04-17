package com.viha.nilesh.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viha.nilesh.model.Recruiter;
import com.viha.nilesh.repo.IRecruiterRepo;
import com.viha.nilesh.service.IRecruiterService;

@Service
public class RecruiterServiceImpl implements IRecruiterService {
	
	@Autowired
	private IRecruiterRepo recruiterRepo;

	@Override
	public String register(Recruiter recruiter) {
		return recruiterRepo.save(recruiter).getFirstName();
	}
	
	@Override
	public Recruiter findByEmailIdAndPassword(String emailId, String password) {
		return recruiterRepo.findByEmailIdAndPassword(emailId, password);
	}

}
