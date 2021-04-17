package com.viha.nilesh.service;

import java.util.List;

import com.viha.nilesh.model.Project;

public interface IProjectService {

	String addProject(Project project);
	List<Project> getAllProjects();
}
