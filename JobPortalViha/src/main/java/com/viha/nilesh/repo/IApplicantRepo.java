package com.viha.nilesh.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.viha.nilesh.model.Applicant;

@Repository
public interface IApplicantRepo extends JpaRepository<Applicant, Integer> {
	Applicant findByEmailIdAndPassword(String emailId, String password);
	List<Applicant> findByProjectId(Integer projectId);
	Page<Applicant> findByProjectId(Integer postId, Pageable pageable);
	Optional<Applicant> findByIdAndProjectId(Integer applicantId, Integer projectId);
}
