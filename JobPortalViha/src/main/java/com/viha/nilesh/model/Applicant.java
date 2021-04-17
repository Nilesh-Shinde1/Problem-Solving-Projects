package com.viha.nilesh.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "VIHA_APPLICANT")
public class Applicant {
	@Id
	@GeneratedValue
	private Integer id;
	//@NotBlank
	//@Size(min=3, max=15, message="First name is mandatory!")
	private String firstName;
	private String lastName;
	//@Email
	private String emailId;
	
	private Long phoneNumber;
	private String password;
	private String profileType;
	private Double yearsOfExperience;
	private Double payPerShift;
	private String location;
	
	@ManyToOne(cascade = CascadeType.ALL, targetEntity=Project.class, fetch = FetchType.EAGER)
	@JoinColumn(name = "project_id", referencedColumnName = "id")
	private Project project;
}
