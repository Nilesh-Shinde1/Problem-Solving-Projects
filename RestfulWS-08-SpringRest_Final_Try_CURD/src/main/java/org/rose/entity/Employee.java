package org.rose.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="EMP23")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	@Column(name="ENO")
	private Integer empNo;
	@Column(name="ENAME")
	private String ename;
	@Column(name="DESG")
	private String desg;
	@Column(name="SAL")
	private Integer sal;
}
