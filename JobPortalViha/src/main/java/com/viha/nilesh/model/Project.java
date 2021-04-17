package com.viha.nilesh.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "VIHA_PROJECTS")
public class Project {
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private Double budget;
	@OneToMany(targetEntity = Applicant.class, cascade = CascadeType.ALL, fetch =FetchType.LAZY, mappedBy="project")
	private Set<Applicant> applicant;
}
