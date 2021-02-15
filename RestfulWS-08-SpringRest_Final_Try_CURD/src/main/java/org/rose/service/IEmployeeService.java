package org.rose.service;

import java.util.List;

import org.rose.entity.Employee;

public interface IEmployeeService {
	public List<Employee> fetchAllEmps();
	public Employee fetchEmpById(Integer id);
	public Employee insertEmpById(Employee employee);
	public Employee updateEmp(Employee employee);
	public void deleteEmpById(Integer id);
}
