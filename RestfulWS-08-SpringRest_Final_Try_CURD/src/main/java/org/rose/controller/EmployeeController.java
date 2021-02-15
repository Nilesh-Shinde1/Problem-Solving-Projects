package org.rose.controller;

import java.util.List;

import org.rose.entity.Employee;
import org.rose.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@Autowired
	IEmployeeService service;
	
	@GetMapping("/getAll")
	public List<Employee> getEmpList(){
		return service.fetchAllEmps();
	}
	
	@GetMapping("/get/{id}")
	public Employee getEmployeeById(@PathVariable(value="id") Integer id) {
		return service.fetchEmpById(id);
	}	
	
//	@Mapping("/delete/{id}")
	@DeleteMapping("/delete/{id}")
	public void deleteEmployeeById(@PathVariable(value="id") Integer id) {
		service.deleteEmpById(id);
	}
	
	@PostMapping("/insert")
	public Employee insertEmployee(@Validated @RequestBody Employee employee) {
		System.out.println("EmployeeController.insertEmployee() : " + employee);
		return service.insertEmpById(employee);
	}
	
	@PutMapping("/update/{id}")
	public Employee updateEmployee(@PathVariable(value="id") Integer id, 
			@RequestBody Employee employee) {
		Employee emp = service.fetchEmpById(id);
		emp.setEname(employee.getEname());
		emp.setEmpNo(employee.getEmpNo());
		emp.setDesg(employee.getDesg());
		emp.setSal(employee.getSal());
		return service.updateEmp(emp);
	}
	
}
