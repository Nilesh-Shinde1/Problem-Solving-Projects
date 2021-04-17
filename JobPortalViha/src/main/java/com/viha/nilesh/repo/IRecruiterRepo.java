package com.viha.nilesh.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.viha.nilesh.model.Recruiter;

@Repository
public interface IRecruiterRepo extends JpaRepository<Recruiter, Integer> {
	Recruiter findByEmailIdAndPassword(String emailId, String password);
}
