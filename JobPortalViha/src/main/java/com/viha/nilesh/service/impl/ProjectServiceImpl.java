package com.viha.nilesh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viha.nilesh.model.Project;
import com.viha.nilesh.repo.IProjectRepo;
import com.viha.nilesh.service.IProjectService;

@Service
public class ProjectServiceImpl implements IProjectService{

	@Autowired
	private IProjectRepo projectRepo;
	
	@Override
	public String addProject(Project project) {
		return projectRepo.save(project).getName();
	}

	@Override
	public List<Project> getAllProjects() {
		return projectRepo.findAll();
	}

}
