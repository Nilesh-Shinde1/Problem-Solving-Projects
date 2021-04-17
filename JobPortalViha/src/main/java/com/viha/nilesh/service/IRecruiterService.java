package com.viha.nilesh.service;

import org.springframework.stereotype.Service;

import com.viha.nilesh.model.Recruiter;

@Service
public interface IRecruiterService {
	String register(Recruiter recruiter);
	Recruiter findByEmailIdAndPassword(String emailId, String password);
}
