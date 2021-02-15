package org.rose.repo;

import org.rose.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	public Employee findByEmpNo(Integer empNo);
}
