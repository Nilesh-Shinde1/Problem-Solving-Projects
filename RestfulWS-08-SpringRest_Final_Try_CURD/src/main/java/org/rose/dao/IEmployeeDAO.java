package org.rose.dao;

import java.util.List;

import org.rose.entity.Employee;

public interface IEmployeeDAO {
	public List<Employee> getAllEmpsData();
	public Employee getEmpById( Integer id);
	public Employee updateEmp(Employee employee);
	public Employee insertEmp(Employee employee);
	public void deleteEmp(Integer id);
}
