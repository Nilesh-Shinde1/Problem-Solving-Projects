package com.viha.nilesh.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "VIHA_JOB")
public class Job {
	@Id
	@GeneratedValue
	private Integer id;
	private String title;
	private String profileType;
	private String jobLocation;
	private Double monthlySalary;
}
