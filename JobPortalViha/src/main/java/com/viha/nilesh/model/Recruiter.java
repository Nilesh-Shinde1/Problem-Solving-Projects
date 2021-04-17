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
@Table(name = "VIHA_RECRUITER")
public class Recruiter {
	@Id
	@GeneratedValue
	private Integer id;
	private String firstName;
	private String lastName;
	private String emailId;
	private Long phoneNumber;
	private String password;
	private String profileType;
}
