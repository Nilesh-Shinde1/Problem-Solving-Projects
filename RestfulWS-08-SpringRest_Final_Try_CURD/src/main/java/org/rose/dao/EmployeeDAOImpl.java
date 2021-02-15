package org.rose.dao;

import java.util.List;

import org.rose.entity.Employee;
import org.rose.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("empDAO")
public class EmployeeDAOImpl implements IEmployeeDAO {
	
	@Autowired
	EmployeeRepo repo;

	@Override
	public List<Employee> getAllEmpsData() {
		return repo.findAll();
	}

	@Override
	public Employee getEmpById(Integer id) {
		return repo.findByEmpNo(id);
//		return repo.getOne(id);
	}

	@Override
	public Employee updateEmp(Employee employee) {
		return repo.save(employee);
	}

	@Override
	public Employee insertEmp(Employee employee) {
		return repo.save(employee);
	}

	@Override
	public void deleteEmp(Integer id) {
		repo.deleteById(id);
	}
	
}