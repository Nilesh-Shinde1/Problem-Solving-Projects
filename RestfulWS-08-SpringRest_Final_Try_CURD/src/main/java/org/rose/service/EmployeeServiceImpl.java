package org.rose.service;

import java.util.List;

import org.rose.dao.IEmployeeDAO;
import org.rose.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("empService")
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	IEmployeeDAO dao;
	
	@Override
	public List<Employee> fetchAllEmps() {
		return dao.getAllEmpsData();
	}
	@Override
	public Employee fetchEmpById(Integer id) {
		return dao.getEmpById(id);
	}
	@Override
	public Employee insertEmpById(Employee employee) {
		return dao.insertEmp(employee);
	}
	@Override
	public Employee updateEmp(Employee employee) {
		return dao.updateEmp(employee);
	}
	@Override
	public void deleteEmpById(Integer id) {
		dao.deleteEmp(id);
	}

}
