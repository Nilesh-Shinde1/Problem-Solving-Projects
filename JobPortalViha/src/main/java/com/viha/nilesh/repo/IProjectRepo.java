package com.viha.nilesh.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.viha.nilesh.model.Project;

@Repository
public interface IProjectRepo extends JpaRepository<Project, Integer>{
	
	
}
