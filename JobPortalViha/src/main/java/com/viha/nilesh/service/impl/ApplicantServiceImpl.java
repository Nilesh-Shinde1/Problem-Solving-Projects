package com.viha.nilesh.service.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viha.nilesh.model.Applicant;
import com.viha.nilesh.repo.IApplicantRepo;
import com.viha.nilesh.service.IApplicantService;

@Service
public class ApplicantServiceImpl implements IApplicantService {
	
	@Autowired
	private IApplicantRepo applicantRepo;

	@Override
	public String register(Applicant applicant) {
		return applicantRepo.save(applicant).getFirstName();
	}
	
	@Override
	public Applicant findByEmailIdAndPassword(String emailId, String password) {
		return applicantRepo.findByEmailIdAndPassword(emailId, password);
	}
	
	@Override
	public Applicant findByApplicantId(Integer id) {
		return applicantRepo.findById(id).get();
	}
	
	@Override
	public Set<Applicant> getAllApplicants() {
		List<Applicant> list = applicantRepo.findAll();
		Set<Applicant> set = new HashSet<Applicant>(list);
		set.addAll(list);
		return set;
	}

}
