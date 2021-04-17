package com.viha.nilesh.service;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.viha.nilesh.model.Applicant;

@Service
public interface IApplicantService {
	String register(Applicant applicant);
	Applicant findByEmailIdAndPassword(String emailId, String password);
	Applicant findByApplicantId(Integer id);
	Set<Applicant> getAllApplicants();
}
